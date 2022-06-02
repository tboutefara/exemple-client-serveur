package com.exemple.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

        public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 3000);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream());
            
            out.println("Bonjour");
            out.flush();
            
            String message = in.readLine();
            System.out.println(message);
            
            in.close();
            out.close();
            client.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
