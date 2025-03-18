public class Room {
    private int roomNumber;
    private String type;
    private boolean isBooked;
    private double price;

    public Room(int roomNumber, String type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public double getPrice() {
        return price;
    }

    public void bookRoom() {
        this.isBooked = true;
    }

    public void freeRoom() {
        this.isBooked = false;
    }

    public String toString() {
        return "Room " + roomNumber + " | Type: " + type + " | Price: $" + price + " | " + (isBooked ? "Booked" : "Available");
    }
}
