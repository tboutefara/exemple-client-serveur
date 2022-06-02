package com.exemple.server;


public class Utilisateur {
    String pseudo;
    String mdp;

    public Utilisateur(String pseudo, String mdp) {
        this.pseudo = pseudo;
        this.mdp = mdp;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
}
