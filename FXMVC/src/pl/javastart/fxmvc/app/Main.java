package pl.javastart.fxmvc.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = (Parent)FXMLLoader.load(getClass().getResource(
                "/pl/javastart/fxmvc/view/LoginPane.fxml"
        ));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login page");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
