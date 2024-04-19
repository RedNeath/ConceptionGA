public class UniqueLink<T, U> {
    private T leftObject;
    private U rightObject;

    public T getLeftObject() {
        return leftObject;
    }

    public U getRightObject() {
        return rightObject;
    }

    public void setLeftObject(T object) {
        this.leftObject = object;
    }

    public void setRightObject(U object) {
        this.rightObject = object;
    }

    public boolean isLeftObjectSet() {
        return leftObject != null;
    }

    public boolean isRightObjectSet() {
        return rightObject != null;
    }

    public void unsetLeftObject() {
        this.leftObject = null;
    }

    public void unsetRightObject() {
        this.rightObject = null;
    }
}
