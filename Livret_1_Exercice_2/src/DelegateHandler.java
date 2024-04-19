import java.util.ArrayList;
import java.util.Iterator;

public class DelegateHandler<T> {
    private final ArrayList<T> fields;

    public DelegateHandler() {
        this.fields = new ArrayList<>();
    }


    public boolean add(T t) {
        return fields.add(t);
    }

    public boolean remove(T t) {
        return this.fields.remove(t);
    }

    public Iterator<T> getIterator() {
        return this.fields.iterator();
    }

    public boolean contains(T t) {
        return this.fields.contains(t);
    }
}
