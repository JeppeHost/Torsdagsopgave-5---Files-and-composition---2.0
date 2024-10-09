package Task3;
import java.util.ArrayList;

public class Building {

    private ArrayList<Room> roomsInBuilding;

    private int numberOfFloors;

    public Building(int numberOfFloors, ArrayList<Room> roomsInBuilding) {
        this.numberOfFloors = numberOfFloors;
        this.roomsInBuilding = roomsInBuilding;
    }

    public ArrayList<Room> getRooms() {
        return roomsInBuilding;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }


}
