package pl.javastart.youtufy.controller;

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

    @FXML
    SearchPaneController searchPaneController;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(controlPaneController);
        System.out.println(contentPaneController);
        System.out.println(menuPaneController);
        System.out.println(searchPaneController);

    }




}
