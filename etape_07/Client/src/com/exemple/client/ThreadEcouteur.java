package com.exemple.client;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadEcouteur extends Thread {
    
    ChatFrame cf;
    
    public ThreadEcouteur(ChatFrame cf) {
        this.cf = cf;
    }
    
    @Override
    public void run(){
        try {
            while(Main.actif){
                String message = Main.in.readLine();
                cf.ajouter(message);
            }
        } catch (IOException ex) {
            Logger.getLogger(ThreadEcouteur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
