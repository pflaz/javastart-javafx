package pl.javastart.youtufy.data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class YoutubeVideo {
    private StringProperty id;
    private StringProperty title;
    private StringProperty author;

    public YoutubeVideo() {
        id = new SimpleStringProperty();
        title = new SimpleStringProperty();
        author = new SimpleStringProperty();
    }

    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        if (id == null) id = new SimpleStringProperty(this, "id");
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getTitle() {
        return title.get();
    }

    public StringProperty titleProperty() {
        if (title == null) title = new SimpleStringProperty(this, "title");
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getAuthor() {
        return author.get();
    }

    public StringProperty authorProperty() {
        if (author == null) author = new SimpleStringProperty(this, "author");
        return author;
    }

    public void setAuthor(String author) {
        this.author.set(author);
    }

    @Override
    public String toString() {
        return "YoutubeVideo{" +
                "id=" + id +
                ", title=" + title +
                ", author=" + author +
                '}';
    }
}
