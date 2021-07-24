import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Elevator> elevatorList;
    private List<Floor> floorList;

    public Building(int numOfElevators, int numOfFloors) {
        this.elevatorList = new ArrayList<>();
        this.floorList = new ArrayList<>();
        for(int i = 1; i <= numOfElevators; i++) {
            elevatorList.add(new Elevator(i, numOfFloors));
        }

        for(int i = 1; i <= numOfFloors; i++) {
            floorList.add(new Floor(i));
        }
    }
}
