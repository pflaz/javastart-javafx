package pl.javastart.media.app;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private MediaView mediaView;

    @FXML
    private ToggleButton playButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Media media = new Media("http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv");
        MediaPlayer player = new MediaPlayer(media);
        player.setAutoPlay(true);

        mediaView.setMediaPlayer(player);
        playButton.setSelected(true);

        playButton.setOnAction(event -> {
            if (playButton.isSelected()) {
                player.play();
            } else {
                player.pause();
            }
        });
    }
}
