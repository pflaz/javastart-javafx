package pl.javastart.fxmvc.controller;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private AnchorPane loginAnchorPane;

    @FXML
    private Label usernameLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private Button loginButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(usernameLabel.getText());
        usernameTextField.setText("Wpisz swoje imię");
    }
}
