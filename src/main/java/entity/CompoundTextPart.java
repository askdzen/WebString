package entity;

import java.util.List;

/**
 * Created by Askar on 03.07.2014.
 */
public interface CompoundTextPart<E extends TextPart> {
    public String toSourceString();


    public void add(E element);

}
