package entity;

import java.util.List;

/**
 * Created by Askar on 05.07.2014.
 */
public class AbstractCompoundTextPart<E extends TextPart> implements CompoundTextPart<E> {
    List<E> elements;

    @Override
    public String toSourceString() {
        return null;
    }
}
