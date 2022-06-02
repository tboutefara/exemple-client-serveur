package com.exemple.server;

import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static boolean actif = true;
    public static List<ThreadClient> clients = new ArrayList<>();
    
    public static void main(String[] args) {
        try {
            ServerSocket serveur = new ServerSocket(3000);
            System.out.println("Serveur démarré sur le port 3000");
            
            while(actif){
                Socket client = serveur.accept();
                ThreadClient ct = new ThreadClient(client);
                ct.start();
            }
            
            serveur.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static void envoieATousLesClient(String message){
        for (int i = 0; i < clients.size(); i++) {
            ThreadClient client = clients.get(i);
            client.envoie(message);
        }
    }
    
}
