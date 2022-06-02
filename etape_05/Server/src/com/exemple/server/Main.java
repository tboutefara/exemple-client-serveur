package com.exemple.server;

import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static boolean ecouter = true;
    
    public static void main(String[] args) {
        try {
            ServerSocket serveur = new ServerSocket(3000);
            System.out.println("Serveur démarré sur le port 3000");
            
            while(ecouter){
                Socket client = serveur.accept();
                ClientThread ct = new ClientThread(client);
                ct.start();
            }
            
            serveur.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
