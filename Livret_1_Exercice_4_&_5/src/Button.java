public class Button {
    private Action action;


    public Action getAction() {
        return this.action;
    }

    public void setAction(Action action) {
        this.detachActionFromItsPreviousButton(action);
        this.action = action;
        this.attachActionToThisButton(action);
    }

    public void detachActionFromItsPreviousButton(Action action) {
        if (action == null || action.getButton() == null) return;

        action.getButton().setAction(null);
    }

    public void attachActionToThisButton(Action action) {
        if (action == null) return;

        if (action.getButton() != this) {
            action.setButton(this);
        }
    }
}
