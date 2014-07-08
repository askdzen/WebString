package parser;

import entity.*;
import org.apache.log4j.Logger;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by Askar on 03.07.2014.
 */
public class Parser extends AbstractCompoundTextPart {
    public static final Logger LOGGER = Logger.getLogger(Parser.class);
/*
    public List<String> parseOnParagraphs(String s) {
        String[] arrParagraphs = s.split("\n");
        List<String> paragraph = new ArrayList<String>();
        for (String arrParagraph : arrParagraphs) {
            paragraph.add(arrParagraph);
        }

        return paragraph;
    }
*/
    public List<String> parseOnSentences(String s) {
        String[] arrSentences = s.split("(?<=[.!?])+[\" \"]");
        List<String> listSentences = new ArrayList<String>();
        for (String arrSentence : arrSentences) {
            listSentences.add(arrSentence);
        }

        return listSentences;
    }

    public Paragraph<CompoundTextPart> parseParagraph(String s) {
        String[] arrParagraphs = s.split("\n");
        List<CompoundTextPart> paragraphParts = new ArrayList<CompoundTextPart>();
        for (String arrParagraph : arrParagraphs) {
            Sentence sentence = new Sentence();
            sentence.setSentences(parseSentence(arrParagraph));
            paragraphParts.add(new Paragraph(sentence.getSentences()));

        }

        Paragraph<CompoundTextPart> paragraph = new Paragraph<CompoundTextPart>(paragraphParts);
        return paragraph;
    }

    public Sentence<SentencePart> parseSentence(String s) {

        String[] arrSentences = s.split("(?<=[.!?]+[\" \"])");
        List<SentencePart> sentenceParts = new ArrayList<SentencePart>();
        for (String arrSentence : arrSentences) {

            String[] arrChars = arrSentence.split("");

            List<SentencePart> symbols = new ArrayList<SentencePart>();

            for (int i = 0; i < arrChars.length; i++) {
                if (arrChars[i].equals(".")) {
                    symbols.add(new Punctuation('.'));
                   sentenceParts.add(symbols.get(i));
                }
              else  if (arrChars[i].equals(",")) {
                    symbols.add(new Punctuation(','));
                   sentenceParts.add(symbols.get(i));
                }
              else  if (arrChars[i].equals("!")) {
                    symbols.add(new Punctuation('!'));
                   sentenceParts.add(symbols.get(i));
                }
              else  if (arrChars[i].equals("?")) {
                    symbols.add(new Punctuation('?'));
                   sentenceParts.add(symbols.get(i));
                }
              else  if (arrChars[i].equals(" ")) {
                    symbols.add(new Whitespace(' '));
                   sentenceParts.add(symbols.get(i));
                }
                else {
                    symbols.add(new Letter(arrChars[i]));
                   sentenceParts.add(symbols.get(i));
                }
            }
        }
        Sentence<SentencePart> sentence = new Sentence<SentencePart>(sentenceParts);

        return sentence;


    }

    public List<Sentence> outSentences(Parser parser, String s) {
        List<String> sentences = parser.parseOnSentences(s);
        Sentence sentenceArrays = new Sentence();
        List<Sentence> comporableSentencesList = new ArrayList<Sentence>();
        for (String sentence : sentences) {
            Sentence comparableSentence = parser.parseSentence(sentence);
            LOGGER.info(comparableSentence.toString());
            // System.out.println(comparableSentence.toString());
            sentenceArrays.setSentences(comparableSentence);
            comporableSentencesList.add(comparableSentence);
        }
        return comporableSentencesList;
    }

    public List<Paragraph> outParagraphs(Parser parser, String s) {
        Paragraph paragraphArrays = new Paragraph();
        Paragraph comparableParagraphs = parser.parseParagraph(s);
        paragraphArrays.setParagraphs(comparableParagraphs);
        //System.out.println(comparableParagraphs.getParagraphsPartlist());
        LOGGER.info(comparableParagraphs.getParagraphsPartlist());
        return comparableParagraphs.getParagraphsPartlist();
    }


}
