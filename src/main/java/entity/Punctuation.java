package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 02.07.2014.
 */
public class Punctuation extends Symbol implements TextPart {
    //private final SentencePart symbol;


    public Punctuation(char value) {
        super(value);

    }

    @Override
    public String toString() {
        return "Punctuation {"+super.getValue()+"} ";
    }

    @Override
    public String toSourceString() {
        return "Punctuation {"+super.getValue()+"} ";
    }
}




