package com.exemple.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadEcouteur extends Thread {
    
    Socket client;

    public ThreadEcouteur(Socket client) {
        this.client = client;
    }
    
    @Override
    public void run(){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            while(Main.actif){
                String message = in.readLine();
                System.out.println(message);
            }
        } catch (IOException ex) {
            Logger.getLogger(ThreadEcouteur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
