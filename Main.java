package Task3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();

        Room room1 = new Room(3, 5);
        Room room2 = new Room(5, 6);
        Room room3 = new Room(6, 6);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(20, rooms);
        Building building2 = new Building(2, rooms);

        System.out.println("Number of lamps in building1: " + countLampsInBuilding(building1));
        System.out.println("Number of windows in building1: " + countWindowsInBuilding(building1));
        System.out.println("Number of rooms in building1: " + countRoomsInBuilding(building1));


        System.out.println("Building1 is normal: " + isNormal(building1));
        System.out.println("Building2 is normal: " + isNormal(building2));

    }

    public static int countLampsInBuilding(Building b){
        int totalLamps = 0;
        for (Room room : b.getRooms()) {
           totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static int countWindowsInBuilding(Building b){
        int totalWindows = 0;
        for (Room room : b.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    public static int countRoomsInBuilding(Building b){
        int totalRooms = 0;
        for (Room room : b.getRooms()) {
            totalRooms++;
        }
        return totalRooms;
    }

    public static boolean isNormal(Building b){

        if(b.getNumberOfFloors() >= b.getRooms().size()){
            return true;
        } else {
            return false;
        }
    }
}



