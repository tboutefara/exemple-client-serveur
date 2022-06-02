package com.exemple.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.Socket;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadClient extends Thread {

    Socket client;
    Utilisateur utilisateur;

    BufferedReader in = null;
    PrintWriter out = null;
    
    boolean actif = true;

    public ThreadClient(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream());
            
            String pseudo = in.readLine();
            String mdp = in.readLine();
            if (AccesBDD.verifierUtilisateur(pseudo, mdp)) {
                out.println("200");
                out.flush();
                
                utilisateur = new Utilisateur(pseudo, mdp);
                Main.clients.add(this);

                while(actif){
                    String message = in.readLine();
                    Main.envoieATousLesClient(this.utilisateur.getPseudo() + ":" + message);
                }
            } else {
                out.println("Echec de connexion");
                out.flush();
            }

            in.close();
            out.close();
            client.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreadClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThreadClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThreadClient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void envoie(String message) {
        System.out.println(message);
        if(out != null){
            out.println(message);
            out.flush();
        }
    }

}
