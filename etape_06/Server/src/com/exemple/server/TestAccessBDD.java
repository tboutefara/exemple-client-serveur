package com.exemple.server;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

// A exécuter une seule fois
public class TestAccessBDD {
    
    public static void main(String[] args) {
        try {
            AccesBDD.insererUtilisateur("Ahmed", "123456");
            AccesBDD.insererUtilisateur("Mohammed", "123456");
            if(!AccesBDD.verifierUtilisateur("Ahmed", "123456")){
                System.out.println("Il y a un problème");
            }else{
                System.out.println("Tout est bon");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestAccessBDD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestAccessBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
