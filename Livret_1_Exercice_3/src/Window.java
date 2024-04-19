import java.util.ArrayList;

public class Window {
    private final ArrayList<Field> widgets;

    public Window() {
        this.widgets = new ArrayList<>();
    }


    public boolean add(Field field) throws IllegalArgumentException {
        if (this.widgets.contains(field)) {
            throw new IllegalArgumentException("Field already inserted in the list!");
        }

        return this.widgets.add(field);
    }

    public boolean contains(Field field) {
        return this.widgets.contains(field);
    }

    // ...
}
