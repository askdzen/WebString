package entity;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * Created by Администратор on 02.07.2014.
 */
public class Sentence extends AbstractCompoundTextPart<SentencePart> implements  TextPart {
    @Override
    public String toSourceString() {
        return "Sentence {"+super.toSourceString()+"} ";
    }


}