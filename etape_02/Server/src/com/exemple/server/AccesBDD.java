package com.exemple.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccesBDD {
    
    public static Connection connexion;
    
    public static Connection getConnexion() throws ClassNotFoundException, SQLException{
        if(connexion == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            connexion = DriverManager.getConnection("jdbc:mysql://localhost/ExempleClientServer", "root", "tarek");
        }
        return connexion;
    }
    
    public static void insererUtilisateur(String pseudo, String mdp) throws ClassNotFoundException, SQLException{
        String requete = "Insert into Utilisateur Values (NULL, ?, ?)";
        PreparedStatement ps = getConnexion().prepareStatement(requete);
        
        ps.setString(1, pseudo);
        ps.setString(2, mdp);
        
        ps.executeUpdate();
    }
    
    public static boolean verifierUtilisateur(String pseudo, String mdp) throws ClassNotFoundException, SQLException{
        boolean reponse = false;
        
        String requete = "Select * from Utilisateur Where pseudo = ? and mot_de_passe = ?";
        PreparedStatement ps = getConnexion().prepareStatement(requete);
        
        ps.setString(1, pseudo);
        ps.setString(2, mdp);
        
        ResultSet resultat = ps.executeQuery();
        
        if(resultat.next()){
            reponse = true;
        }
        
        return reponse;
    }
    
}
