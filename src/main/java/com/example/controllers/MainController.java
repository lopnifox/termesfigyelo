/*
* File: MainController.java
* Author: Nagy Áron
* Copyright: 2021, Nagy Áron
* Group: Szoft IN
* Date: 2026-05-24
* Github: https://github.com/lopnifox/
* Licenc: MIT
*/

package com.example.controllers;

import com.example.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void onClickAboutButton(ActionEvent event) {
        App.setRoot("aboutScene");
    }


    @FXML
    void onClickCropsButton(ActionEvent event) {
        App.setRoot("cropScene");
    }

}
