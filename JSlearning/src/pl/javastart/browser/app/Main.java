package pl.javastart.browser.app;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Main extends Application implements Initializable {

    @FXML
    private WebView webView;

    @FXML
    private Button previousButton;

    @FXML
    private Button nextButton;

    private HistoryScripter historyScripter = new HistoryScripter();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource(
                "/pl/javastart/browser/app/BrowserPane.fxml"
        ));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        WebEngine engine = webView.getEngine();
        engine.load("http://google.com");

        previousButton.setOnAction(event -> historyScripter.historyBack(engine));
        nextButton.setOnAction(event -> historyScripter.historyForward(engine));
    }
}
