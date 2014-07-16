package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 02.07.2014.
 */
public class Paragraph extends AbstractCompoundTextPart<Sentence> implements  TextPart {


    @Override
    public String toSourceString() {
        return "Paragraph {"+super.toSourceString()+"} ";
    }
}
