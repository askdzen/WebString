package entity;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * Created by Администратор on 02.07.2014.
 */
public class Sentence<E extends SentencePart> implements CompoundTextPart, TextPart {

    List<E> sentenceParts = new ArrayList<E>();
    List<Sentence> sentences = new ArrayList<Sentence>();

    public Sentence() {};




    public Sentence(List<E> sentenceParts) {
        this.sentenceParts = sentenceParts;

    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(Sentence sentences) {

        this.sentences.add(sentences);
    }

    public List<E> getSentenceParts() {
        return sentenceParts;
    }

    public void setSentenceParts(List<E> sentenceParts) {
        this.sentenceParts = sentenceParts;
    }

    @Override
    public String toString() {
        return "\n"+"Sentence:" + sentenceParts;


    }

    @Override
    public String toSourceString() {
        StringBuilder builder = new StringBuilder();
        for (SentencePart sentencePart : sentenceParts) {
            builder.append(sentencePart.toSourceString());
        }
        return builder.toString();
    }


}