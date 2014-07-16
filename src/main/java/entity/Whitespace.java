package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 02.07.2014.
 */
public class Whitespace extends Symbol {


    public Whitespace(char value) {
        super(value);
    }

    @Override
    public String toSourceString() {
        return "Whitespace {"+super.getValue()+"} ";
    }

    @Override
    public String toString() {
        return "Whitespace {"+super.getValue()+"} ";
    }
}
