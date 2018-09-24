package pl.javastart.youtufy.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button previousButton;

    @FXML
    private Button playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;

    @FXML
    private TextField searchTextField;

    @FXML
    private ListView<?> historyListView;

    @FXML
    private WebView videoWebView;

    @FXML
    private TableView<?> resultTableView;

    @FXML
    private MenuBar mainMenu;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
