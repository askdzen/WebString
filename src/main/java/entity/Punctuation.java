package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 02.07.2014.
 */
public class Punctuation implements SentencePart {
    private final char symbol;
    List<Character>punctuations=new ArrayList<Character>();

    public Punctuation(char simbol) {
        this.symbol = simbol;

        punctuations.add(simbol);
    }

    @Override
    public String toString() {
        return "Punctuation{" +
                "symbol=" + symbol +
                '}';
    }

    @Override
    public String toSourceString() {
        return String.valueOf(this.symbol);
    }

}
