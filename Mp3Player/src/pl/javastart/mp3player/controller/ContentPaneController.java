package pl.javastart.mp3player.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import pl.javastart.mp3player.mp3.Mp3Collection;
import pl.javastart.mp3player.mp3.Mp3Song;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ContentPaneController implements Initializable {

    public static final String TITLE_COLUMN = "Tytuł";
    public static final String AUTHOR_COLUMN = "Autor";
    public static final String ALBUM_COLUMN = "Album";
    private Mp3Collection mp3Collection;

    @FXML
    private TableView<Mp3Song> contentTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configureTable();
        configureTestMp3();
    }

    private void configureTestMp3() {
        mp3Collection = new Mp3Collection();
        contentTable.setItems(mp3Collection.getSongList());

        Mp3Song mp3Song = createMp3SongFromPath("test.mp3");
        mp3Collection.addSong(mp3Song);

    }

    private Mp3Song createMp3SongFromPath(String filePath) {
        File file = new File(filePath);
        Mp3Song result = new Mp3Song();
        try {
            MP3File mp3File = new MP3File(file);
            result.setFilePath(file.getAbsolutePath());
            result.setTitle(mp3File.getID3v2Tag().getSongTitle());
            result.setAuthor(mp3File.getID3v2Tag().getLeadArtist());
            result.setAlbum(mp3File.getID3v2Tag().getAlbumTitle());
        } catch (IOException | TagException e) {
            e.printStackTrace();
        }
        return result;
    }

    private void configureTable() {
        TableColumn<Mp3Song, String> titleColumn = new TableColumn<>(TITLE_COLUMN);
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        TableColumn<Mp3Song, String> authorColumn = new TableColumn<>(AUTHOR_COLUMN);
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));

        TableColumn<Mp3Song, String> albumColumn = new TableColumn<>(ALBUM_COLUMN);
        albumColumn.setCellValueFactory(new PropertyValueFactory<>("album"));

        contentTable.getColumns().add(titleColumn);
        contentTable.getColumns().add(authorColumn);
        contentTable.getColumns().add(albumColumn);
    }
}
