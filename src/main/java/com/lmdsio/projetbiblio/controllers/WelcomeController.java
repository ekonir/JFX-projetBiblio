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

    @FXML
    private Label userText;

    @FXML
    protected void initialize() {
        UtilisateurService service = new UtilisateurService();
        Utilisateur connecte = service.getUser();

        if( connecte == null ) {
            userText.setText("veuillez vous connecter");
        } else {
            userText.setText("Utilisateur : " + connecte.getLogin() + " ( "+ connecte.getNom()+" " + connecte.getPrenom()+ " )");}
    }

}
