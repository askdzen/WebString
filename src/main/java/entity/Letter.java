package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Askar on 05.07.2014.
 */
public class Letter extends Word implements SentencePart{
  private String letter;
    List<String>letters=new ArrayList<String>();

    public Letter(String letter) {
this.letter=letter;
if(letter.equals(null))
       letters.add(" ");
        else letters.add(letter);
    }

    public void setLetters(String letters) {

    }

    @Override
    public String toString() {
        return "Letter{" +
                "letter='" + letter + '\'' +
                '}';
    }
}
