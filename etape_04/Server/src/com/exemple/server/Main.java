package com.exemple.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        try {
            ServerSocket serveur = new ServerSocket(3000);
            System.out.println("Serveur démarré sur le port 3000");
            Socket client = serveur.accept();
            
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream());
            
            String pseudo = in.readLine();
            String mdp = in.readLine();
            
            if(AccesBDD.verifierUtilisateur(pseudo, mdp)){
                out.println("Connexion réussite");
            }else{
                out.println("Echec de connexion");
            }
            out.flush();
            
            in.close();
            out.close();
            client.close();
            serveur.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
