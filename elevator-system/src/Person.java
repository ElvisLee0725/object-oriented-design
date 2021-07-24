public class Person {
    private String name;
    private int weight;
    private int atFloor;
    private int goingTo;

    public Person(String name, int weight, int atFloor, int goingTo) {
        this.name = name;
        this.weight = weight;
        this.atFloor = atFloor;
        this.goingTo = goingTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAtFloor() {
        return atFloor;
    }

    public void setAtFloor(int atFloor) {
        this.atFloor = atFloor;
    }

    public int getGoingTo() {
        return goingTo;
    }

    public void setGoingTo(int goingTo) {
        this.goingTo = goingTo;
    }
}
