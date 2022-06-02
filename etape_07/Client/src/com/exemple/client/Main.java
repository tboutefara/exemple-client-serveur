package com.exemple.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static boolean actif = true;
    public static Socket client;
    public static BufferedReader in;
    public static PrintWriter out;

    public static void main(String[] args) {
        try {
            client = new Socket("localhost", 3000);

            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream());

            (new AuthentificationFrame()).setVisible(true);

            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
