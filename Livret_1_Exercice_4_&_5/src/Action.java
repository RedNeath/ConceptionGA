public class Action {
    private Button button;


    public Button getButton() {
        return this.button;
    }

    public void setButton(Button button) {
        this.detachButtonFromItsPreviousAction(button);
        this.button = button;
        this.attachButtonToThisAction(button);
    }

    public void detachButtonFromItsPreviousAction(Button button) {
        if (button == null || button.getAction() == null) return;

        button.getAction().setButton(null);
    }

    public void attachButtonToThisAction(Button button) {
        if (button == null) return;

        if (button.getAction() != this) {
            button.setAction(this);
        }
    }
}
