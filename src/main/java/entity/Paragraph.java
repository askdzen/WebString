package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 02.07.2014.
 */
public class Paragraph<E extends CompoundTextPart> implements CompoundTextPart, TextPart {
    List<E> paragraphsPartlist;
    List<Paragraph> paragraphs=new ArrayList<Paragraph>();

    public Paragraph(List<E> paragraphParts) {
        this.paragraphsPartlist = paragraphParts;
    }
public  Paragraph(){};


    public void setParagraphs(Paragraph paragraph) {

        this.paragraphs.add(paragraph);
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public List<E> getParagraphsPartlist() {
        return paragraphsPartlist;
    }

    @Override
    public String toSourceString() {
        StringBuilder builder = new StringBuilder();
        for (CompoundTextPart paragraphPartlist : paragraphsPartlist) {
            builder.append(paragraphPartlist.toSourceString());
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (CompoundTextPart paragraphlist : paragraphsPartlist) {
            builder.append(paragraphlist.toString());
        }
        return " Paragraphs"+"\n"+builder.toString();
    }
}
