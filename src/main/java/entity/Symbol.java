package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Askar on 14.07.2014.
 */
public abstract class Symbol implements SentencePart {
    private final char value;
    List<Character>sentenceParts=new ArrayList<>();

    protected Symbol(char value) {
        this.value = value;
        sentenceParts.add(value);
    }

    @Override
    public String toSourceString() {
        StringBuilder builder =new StringBuilder();
        for (Character sentencePart : sentenceParts) {
            builder.append(sentencePart.charValue());
        }
        return builder.toString();
    }


    public void add(Character element) {
        sentenceParts.add(element);
    }


}
