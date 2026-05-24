/*
* File: CropsController.java
* Author: Nagy Áron
* Copyright: 2021, Nagy Áron
* Group: Szoft IN
* Date: 2026-05-24
* Github: https://github.com/lopnifox/
* Licenc: MIT
*/

package com.example.controllers;

import java.util.List;

import com.example.App;
import com.example.Storage;
import com.example.models.Crop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CropsController {

    @FXML
    private TableView<Crop> cropTable;

    @FXML
    private TableColumn<Crop, String> harvestEndCol;

    @FXML
    private TableColumn<Crop, String> nameCol;

    @FXML
    private TableColumn<Crop, Integer> yieldCol;

    @FXML
    private TableColumn<Crop, String> fieldCol;

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

    @FXML
    void initialize() {
        List<Crop> cropList = Storage.readContent();
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        fieldCol.setCellValueFactory(new PropertyValueFactory<>("field"));
        yieldCol.setCellValueFactory(new PropertyValueFactory<>("yield"));
        harvestEndCol.setCellValueFactory(new PropertyValueFactory<>("harvestEnd"));
        if (cropList != null) {
            cropTable.getItems().addAll(cropList);
        }
    }
}
