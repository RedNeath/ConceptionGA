package question_3.with_delegate;

import java.util.ArrayList;
import java.util.Iterator;

public class DelegateField {
    private final ArrayList<Field> fields;

    public DelegateField() {
        this.fields = new ArrayList<>();
    }


    public boolean add(Field field) {
        return fields.add(field);
    }

    public boolean remove(Field field) {
        return this.fields.remove(field);
    }

    public Iterator<Field> getIterator() {
        return this.fields.iterator();
    }
}
