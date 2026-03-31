package com.lmdsio.projetbiblio.controllers;

import com.lmdsio.projetbiblio.models.Utilisateur;
import com.lmdsio.projetbiblio.services.DbService;
import com.lmdsio.projetbiblio.services.UtilisateurService;

import java.sql.ResultSet;
import java.sql.SQLException;
import at.favre.lib.crypto.bcrypt.BCrypt;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class WelcomeController extends DbService {

    static private Utilisateur user = null;
    public Utilisateur getUser() {
        return user;
    }

}
