package pl.javastart.fxaction.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private TextArea textArea;

    @FXML
    private Button lowerCaseButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lowerCaseButton.addEventFilter(MouseEvent.MOUSE_CLICKED, x -> System.out.println("CLICKED"));

    }

    @FXML
    private void toLowerCaseAction(ActionEvent event) {
        System.out.println("toLowerCaseAction()");
        textArea.setText(textArea.getText().toLowerCase());
    }
}
