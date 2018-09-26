package pl.javastart.youtufy.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;

import java.net.URL;
import java.util.ResourceBundle;

public class ControlPaneController implements Initializable {

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configureButtons();
    }
}
