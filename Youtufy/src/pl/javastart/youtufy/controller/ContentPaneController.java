package pl.javastart.youtufy.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class ContentPaneController implements Initializable {

    @FXML
    private WebView videoWebView;

    @FXML
    private TableView<?> resultTableView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
