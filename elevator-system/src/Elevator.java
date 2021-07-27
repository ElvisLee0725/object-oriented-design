import java.util.List;

public class Elevator {
    private Integer id;
    private int capacity;
    List<Integer> paths;
    List<Button> buttonList;

    public Elevator(Integer id, int numOfFloors) {
        this.id = id;
        this.capacity = 1500;
        for(int i = 1; i <= numOfFloors; i++) {
            buttonList.add(new Button(i));
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
