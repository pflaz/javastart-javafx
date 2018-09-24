package pl.javastart.fxaction.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Exercise48Controller implements Initializable {

    @FXML
    private TextArea leftTextField;

    @FXML
    private TextArea rightTextField;

    @FXML
    private Button clearButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        clearButton.setOnAction(event -> {
            leftTextField.clear();
            rightTextField.clear();
        });

        leftTextField.addEventFilter(KeyEvent.KEY_RELEASED, event -> {
            StringBuilder stringBuilder = new StringBuilder(leftTextField.getText()).reverse();
            rightTextField.setText(stringBuilder.toString());
        });

        rightTextField.addEventFilter(KeyEvent.KEY_RELEASED, event ->
            leftTextField.setText(new StringBuilder(rightTextField.getText()).reverse().toString())
        );

    }
}
