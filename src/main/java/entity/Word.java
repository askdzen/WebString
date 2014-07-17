package entity;

import com.sun.org.apache.xpath.internal.operations.*;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 02.07.2014.
 */
public class Word extends AbstractCompoundTextPart<SentencePart> implements SentencePart  {



    @Override
    public String toSourceString() {
        return "Word {"+super.toSourceString()+"}";
    }
}
