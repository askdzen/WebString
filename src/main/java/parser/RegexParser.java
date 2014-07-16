package parser;

import entity.*;
import org.apache.log4j.Logger;


/**
 * Created by Askar on 03.07.2014.
 */
public class RegexParser extends AbstractCompoundTextPart implements Parser {
    public static final Logger LOGGER = Logger.getLogger(RegexParser.class);

    public static final String PARAGRAPH_MARGIN="[\r\n]+";
    private static final String SENTENCE_MARGIN = "(?<=[.!?])+";
    private static final String SENTENCE_PART_MARGIN = "";

    public Text parseText(String textSource){
    Text text=new Text();
     String[]split=textSource.split(PARAGRAPH_MARGIN);
    for (String s : split) {
Paragraph paragraph=parseParagraph(s);
        text.add(paragraph);

    }
        //System.out.println(text.toSourceString());
    return text;
}

    private Paragraph parseParagraph(String textSource) {
        Paragraph paragraph=new Paragraph();
        String[]split=textSource.split(SENTENCE_MARGIN);
        for (String itemSource : split) {
            Sentence sentence = parseSentence(itemSource);
            paragraph.add(sentence);

        }
       //System.out.println(paragraph);
        return paragraph;
    }

    private Sentence parseSentence(String itemSource) {
        Sentence sentence=new Sentence();
        String[]split=itemSource.split(SENTENCE_PART_MARGIN);

        for (String itemSource1 : split) {
            if (itemSource1.equals(' ')){
            Whitespace whitespace = new Whitespace(' ');
            sentence.add(whitespace);}
            if (itemSource1.equals(',')){
                Punctuation punctuation=new Punctuation(',');
sentence.add(punctuation);
            }
            if (itemSource1.equals('.')){
                Punctuation punctuation=new Punctuation('.');
                sentence.add(punctuation);
            }
            if (itemSource1.equals('!')){
                Punctuation punctuation=new Punctuation('!');
                sentence.add(punctuation);
            }
            if (itemSource1.equals('?')){
                Punctuation punctuation=new Punctuation('?');
                sentence.add(punctuation);

                }
            else

            {Letter letter=new Letter(itemSource1.charAt(0));
            sentence.add(letter);
            }
        }
        System.out.println(sentence.toString());
        return sentence;
    }


}
