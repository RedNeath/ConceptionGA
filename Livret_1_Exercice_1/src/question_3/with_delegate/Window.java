package question_3.with_delegate;

public class Window {
    private final DelegateField fields;

    public Window() {
        this.fields = new DelegateField();
    }

    public DelegateField getDelegateFields() {
        return this.fields;
    }
}
