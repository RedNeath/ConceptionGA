package question_3.base;

import java.util.ArrayList;

public class Window {
    private final ArrayList<Field> widgets;

    public Window() {
        this.widgets = new ArrayList<>();
    }


    public boolean add(Field field) {
        return this.widgets.add(field);
    }

    public boolean contains(Field field) {
        return this.widgets.contains(field);
    }

    // ...
}
