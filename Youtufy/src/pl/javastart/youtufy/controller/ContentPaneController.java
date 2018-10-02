package pl.javastart.youtufy.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import pl.javastart.youtufy.data.YoutubeVideo;

import java.net.URL;
import java.util.ResourceBundle;

public class ContentPaneController implements Initializable {

    @FXML
    private WebView videoWebView;

    @FXML
    private TableView<YoutubeVideo> resultTableView;

    public WebView getVideoWebView() {
        return videoWebView;
    }

    public void setVideoWebView(WebView videoWebView) {
        this.videoWebView = videoWebView;
    }

    public TableView<YoutubeVideo> getResultTableView() {
        return resultTableView;
    }

    public void setResultTableView(TableView<YoutubeVideo> resultTableView) {
        this.resultTableView = resultTableView;
    }

    private void configureWebView() {
        WebEngine webEngine = videoWebView.getEngine();
        webEngine.setJavaScriptEnabled(true);
        webEngine.load(getClass().getResource("/pl/javastart/youtufy/res/video.html").toExternalForm());
    }

    protected void playSelectedItem() {
        WebEngine webEngine = videoWebView.getEngine();
        webEngine.executeScript("player.stopVideo();");
        YoutubeVideo selectedVideo = resultTableView.getSelectionModel().getSelectedItem();
        webEngine.executeScript("player.loadVideoById(\"" + selectedVideo.getId() + "\");");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        TableColumn<YoutubeVideo, String> titleColumn = new TableColumn<>("Song");
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        TableColumn<YoutubeVideo, String> authorColumn = new TableColumn<>("Youtube author");
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));

        resultTableView.getColumns().add(titleColumn);
        resultTableView.getColumns().add(authorColumn);

        configureWebView();

    }
}
