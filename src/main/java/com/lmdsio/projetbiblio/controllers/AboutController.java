package com.lmdsio.projetbiblio.controllers;


import com.lmdsio.projetbiblio.BiblioApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleButton;

import javax.swing.*;


public class AboutController {

    @FXML
    private Label credits;

    @FXML
    private ToggleButton tggleCredits;

    @FXML
    protected void showCredit() {
        if (tggleCredits.isSelected()) {
            credits.setVisible(true);
        } else {
            credits.setVisible(false);
        }
    }


}
