package pl.javastart.fx.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ControlPaneController implements Initializable {

    @FXML
    private Button smallLettersButton;

    @FXML
    private Button bigLettersButton;

    public Button getSmallLettersButton() {
        return smallLettersButton;
    }

    public void setSmallLettersButton(Button smallLettersButton) {
        this.smallLettersButton = smallLettersButton;
    }

    public Button getBigLettersButton() {
        return bigLettersButton;
    }

    public void setBigLettersButton(Button bigLettersButton) {
        this.bigLettersButton = bigLettersButton;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
