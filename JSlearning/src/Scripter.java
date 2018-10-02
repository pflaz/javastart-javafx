import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Scripter {
    public static void main(String[] args) {
        ScriptEngine jsEngine = new ScriptEngineManager().getEngineByName("nashorn");
        try {
            jsEngine.eval("print('Hello');");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
