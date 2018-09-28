package pl.javastart.notes.main;

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
        Parent parent = FXMLLoader.load(getClass().getResource(
                "/pl/javastart/notes/view/MainView.fxml"
        ));
        Scene scene = new Scene(parent);
        primaryStage.setTitle("Simple notes");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
