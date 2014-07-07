package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 02.07.2014.
 */
public class Whitespace implements SentencePart {
    private char symbol;
    List<Character>whitespace=new ArrayList<Character>();

    public Whitespace(char symbol) {
        this.symbol = symbol;
         whitespace.add(symbol);
    }

    @Override
    public String toString() {
        return "Whitespace{" +
                "symbol=" + symbol +
                '}';
    }

    @Override
    public String toSourceString() {
        return String.valueOf(symbol);


    }
}
