package pl.javastart.browser.app;

import javafx.scene.web.WebEngine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class HistoryScripter {
    private ScriptEngine jsEngine = new ScriptEngineManager().getEngineByName("nashorn");

    public void historyBack(WebEngine webEngine) {

            webEngine.executeScript("history.back()");
//            jsEngine.eval("history.back()");
    }

    public void historyForward(WebEngine webEngine) {

        webEngine.executeScript("history.forward()");
//            jsEngine.eval("history.forward()");
    }
}
