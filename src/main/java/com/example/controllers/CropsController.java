package com.example.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CropsController {

    @FXML
    private TableView<?> cropTable;

    @FXML
    private TableColumn<?, ?> harvestCol;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private TableColumn<?, ?> quantityCol;

    @FXML
    private TableColumn<?, ?> vineyardCol;

    @FXML
    void onClickBackButton(ActionEvent event) {

    }

}
