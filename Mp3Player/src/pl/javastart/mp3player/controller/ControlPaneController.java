package pl.javastart.mp3player.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ControlPaneController implements Initializable {

    @FXML
    private Button prevButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configureButtons();
        configureSliders();
    }

    private void configureSliders() {
         volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
             @Override
             public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                 System.out.println("Volume level changed: " + newValue.doubleValue());
             }
         });

         songSlider.valueProperty().addListener(x -> System.out.println("Przesunięcie piosenki"));
    }

    private void configureButtons() {
        prevButton.setOnAction(event -> System.out.println("Previous song"));
        nextButton.setOnAction(event -> System.out.println("Next song"));
        playButton.setOnAction(event -> {
            if (playButton.isSelected()) {
                System.out.println("Play");
            } else {
                System.out.println("Stop");
            }
        });

    }
}