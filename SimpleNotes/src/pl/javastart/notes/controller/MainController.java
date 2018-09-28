package pl.javastart.notes.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button clearButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        clearButton.setOnAction(event -> mainTextArea.clear());
    }
}
