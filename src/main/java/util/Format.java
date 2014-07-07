package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Askar on 30.06.2014.
 */
public class Format {

    public String text;
    public String paragraph;
    public String sentence;
    public String word;
    public String character;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }


    public int[] getParagraphIndex(int beginParagraph, int endParagraph) {
        int[] indexses = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = 0;
        for (int i = 0; i < 200; i++) {

            index = this.text.indexOf("\n", index + 1);
            list.add(this.text.indexOf("\n", index));
            if (index == this.text.lastIndexOf("\n")) break;
        }
        if (beginParagraph == 1) {
            indexses[0] = 0;
        } else indexses[0] = list.get(beginParagraph - 2);

        indexses[1] = list.get(endParagraph - 1);
        return indexses;
    }


    public String getParagraph(String text, int beginIndex, int endIndex) {
        paragraph = text.substring(getParagraphIndex(beginIndex, endIndex)[0], getParagraphIndex(beginIndex, endIndex)[1]);
        //this.setParagraph(paragraph);
        return paragraph;

    }

    public String getSentence(String paragraph, int beginIndex, int endIndex) {
        sentence = paragraph.substring(getSentenceIndex(beginIndex, endIndex)[0], getSentenceIndex(beginIndex, endIndex)[1]);
        // this.setSentence(sentence);
        return sentence;
    }

    public int[] getSentenceIndex(int beginSentence, int endSentence) {
        int[] indexses = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = 0;
        for (int i = 0; i < 200; i++) {

            index = this.paragraph.indexOf(". ", index + 1);
            list.add(this.paragraph.indexOf(". ", index));
            if (index == this.paragraph.lastIndexOf(". ")) break;
        }
        if (beginSentence == 1) {
            indexses[0] = 0;
        } else indexses[0] = list.get(beginSentence - 2) + 2;

        indexses[1] = list.get(endSentence - 1) + 1;
        return indexses;
    }

    public String getWord(String sentence, int index) {
        word = sentence.split(" ")[index - 1];
        return word;
    }

    public String getChar(String word, int index) {
        character = word.split("")[index-1];
        return character;
    }
}
