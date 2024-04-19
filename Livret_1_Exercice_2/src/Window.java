
public class Window {
    private final DelegateHandler<Field> fields;

    public Window() {
        this.fields = new DelegateHandler<>();
    }

    public DelegateHandler<Field> getDelegateFields() {
        return this.fields;
    }
}
