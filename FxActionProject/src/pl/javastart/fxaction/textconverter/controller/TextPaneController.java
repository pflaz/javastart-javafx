package pl.javastart.fxaction.textconverter.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class TextPaneController {

    @FXML
    private TextArea leftTextField;

    @FXML
    private TextArea rightTextField;

    public TextArea getLeftTextField() {
        return leftTextField;
    }

    public void setLeftTextField(TextArea leftTextField) {
        this.leftTextField = leftTextField;
    }

    public TextArea getRightTextField() {
        return rightTextField;
    }

    public void setRightTextField(TextArea rightTextField) {
        this.rightTextField = rightTextField;
    }

}
