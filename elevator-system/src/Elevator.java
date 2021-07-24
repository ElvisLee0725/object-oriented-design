import java.util.List;

public class Elevator {
    private Integer id;
    private int capacity;
    private int [] paths;
    private List<Button> buttonList;

    public Elevator(Integer id, int numOfFloors) {
        this.id = id;
        this.capacity = 1500;
        for(int i = 1; i <= numOfFloors; i++) {
            buttonList.add(new Button(i));
        }
    }
}
