package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Askar on 05.07.2014.
 */
public class AbstractCompoundTextPart<E extends TextPart> implements CompoundTextPart<E> {
    private List<E> elements=new ArrayList<E>();

    @Override
    public String toSourceString() {
        StringBuilder builder = new StringBuilder();
        for (E element : elements) {
            builder.append(element.toSourceString());
        }
        return builder.toString();
    }

    public List<E> getElements() {
        return elements;
    }

    public void setElements(List<E> elements) {
        this.elements = elements;
    }

    @Override
    public void add(E element) {
        elements.add(element);
    }
}
