import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
        rooms.add(new Room(101, "Single", 50.0));
        rooms.add(new Room(102, "Double", 80.0));
        rooms.add(new Room(103, "Suite", 150.0));
    }

    public void displayRooms() {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    public boolean bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isBooked()) {
                room.bookRoom();
                System.out.println("Room " + roomNumber + " booked successfully!");
                return true;
            }
        }
        System.out.println("Room not available!");
        return false;
    }

    public boolean checkout(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isBooked()) {
                room.freeRoom();
                System.out.println("Checkout successful! Total Bill: $" + room.getPrice());
                return true;
            }
        }
        System.out.println("Invalid room number or room is not booked.");
        return false;
    }
}
