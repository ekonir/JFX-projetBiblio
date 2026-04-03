package com.lmdsio.projetbiblio.controllers;

import com.lmdsio.projetbiblio.BiblioApplication;
import com.lmdsio.projetbiblio.controllers.ContentController;
import com.lmdsio.projetbiblio.services.UtilisateurService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;

public class MasterController {

    @FXML
    private ScrollPane contentPane;

    @FXML
    protected void initialize() {
        ContentController.setMaster(this);
        showContent("welcome");
    }

    @FXML
    protected void onMenuConnexion(){
        showContent("login");
    }

    @FXML
    protected void OnMenuDeconnexion(){
        boolean ok = new UtilisateurService().signOut();
        if(ok){
            showContent("welcome");
        }
    }

    @FXML
    protected void onApropos(){
        showContent("about");
    }

    @FXML
    protected void onMenuBienvenue(){
        showContent("welcome");
    }


    protected void showContent(String fxmlName) {
        Node contentNode;

        try {
            FXMLLoader fxmlLoader =
                    new FXMLLoader(BiblioApplication.class.getResource("views/" + fxmlName + ".fxml"));
            contentNode = fxmlLoader.load();

        } catch (Exception e) {

            contentNode = null;
        }

        contentPane.setContent(contentNode);
    }
}
