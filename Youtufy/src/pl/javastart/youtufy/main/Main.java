package pl.javastart.youtufy.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        final String appName = "Youtufy";
        Parent parent = FXMLLoader.load(getClass().getResource(
                "/pl/javastart/youtufy/view/MainPane.fxml"
        ));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle(appName);
        primaryStage.show();
    }
}
