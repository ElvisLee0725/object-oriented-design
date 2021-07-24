public class Floor {
    private Integer id;
    private Button up;
    private Button down;

    public Floor(Integer id) {
        this.id = id;
        this.up = new Button(0);
        this.down = new Button(1);
    }
}
