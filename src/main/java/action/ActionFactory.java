package action;


import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    private final static Map<String, Action> actions = new HashMap<>();

    static {
        actions.put("parse", new ParseAction());
        actions.put("parseP", new ParseActionOnlyParagraphs());
        actions.put("parseS", new ParseActionOnlySentences());
    }

    public static Action getAction(String actionName) {
        return actions.get(actionName);
    }
}
