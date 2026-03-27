package com.lmdsio.projetbiblio.models;

public class Utilisateur {
    private String login, password;
    private String nom, prenom;
    private char compte;

    // Constructeur avec login
    public Utilisateur(String login) {
        this.login = login;
    }

    // Getter et Setter pour login
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    // Getter et Setter pour password
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter et Setter pour nom
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter et Setter pour prenom
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Getter et Setter pour compte
    public char getCompte() {
        return compte;
    }
    public void setCompte(char compte) {
        this.compte = compte;
    }
}
