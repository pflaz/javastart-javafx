package pl.javastart.mp3player.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    ContentPaneController contentPaneController;

    @FXML
    ControlPaneController controlPaneController;

    @FXML
    MenuPaneController menuPaneController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
}
