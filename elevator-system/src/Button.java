public class Button {
    private Integer id;
    private boolean isPressed;

    public Button(Integer id) {
        this.id = id;
        this.isPressed = false;
    }

    public boolean isPressed() {
        return isPressed;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }
}
