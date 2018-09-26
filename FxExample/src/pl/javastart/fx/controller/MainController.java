package pl.javastart.fx.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private ContentPaneController contentPaneController;

    @FXML
    private ControlPaneController controlPaneController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Button smallLetters = controlPaneController.getSmallLettersButton();
        Button bigLetters = controlPaneController.getBigLettersButton();
        TextArea textArea = contentPaneController.getMainTextArea();

        smallLetters.setOnAction(event -> textArea.setText(textArea.getText().toLowerCase()));
        bigLetters.setOnAction(event -> textArea.setText(textArea.getText().toUpperCase()));

    }
}
