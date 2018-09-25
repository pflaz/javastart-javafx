package pl.javastart.youtufy.controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button previousButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;

    @FXML
    private TextField searchTextField;

    @FXML
    private ListView<String> historyListView;

    @FXML
    private WebView videoWebView;

    @FXML
    private TableView<?> resultTableView;

    @FXML
    private MenuBar mainMenu;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configureButtons();
        configureSearchField();

    }

    private void configureSearchField() {
        searchTextField.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                String searchQuery = searchTextField.getText();
                ObservableList<String> historyList = historyListView.getItems();

                if (event.getCode().equals(KeyCode.ENTER)){
                    if (historyList.isEmpty() || !historyList.get(0).equals(searchQuery)) {
                        historyList.add(0, searchQuery);
                    }
                }
            }
        });

    }

    public void configureButtons() {
        previousButton.setOnAction(event -> System.out.println("Previous"));
        nextButton.setOnAction(event -> System.out.println("Next"));
        playButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (playButton.isSelected()) {
                    System.out.println("Playing...");
                } else {
                    System.out.println("Stop");
                }
            }
        });
    }
}
