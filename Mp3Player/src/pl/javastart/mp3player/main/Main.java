package pl.javastart.mp3player.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        final String appName = "Mp3Player v0.3";
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 400);
//        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setTitle(appName);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
