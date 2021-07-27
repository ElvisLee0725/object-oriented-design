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

    // Return the id of the elevator
    public Integer selectElevator(int floorId) {
        Integer elevatorId = null;
        for(Elevator elevator : elevatorList) {
            for(Button button : elevator.buttonList) {
                if(!button.isPressed()) {
                    button.setPressed(true);
                    elevatorId = elevator.getId();
                }
            }
        }
        return elevatorId;
    }

    public void cancelElevator(int elevatorId, int floorId) {

    }

    public void moveToFirst(int elevatorId) {

    }

}
