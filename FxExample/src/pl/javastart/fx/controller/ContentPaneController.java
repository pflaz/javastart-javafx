package pl.javastart.fx.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class ContentPaneController implements Initializable {

    @FXML
    private TextArea mainTextArea;

    public TextArea getMainTextArea() {
        return mainTextArea;
    }

    public void setMainTextArea(TextArea mainTextArea) {
        this.mainTextArea = mainTextArea;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
