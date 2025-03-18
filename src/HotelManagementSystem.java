import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        Hotel hotel = new Hotel();

        System.out.println("Welcome to Hotel Management System");

        // User Login
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (!user.login(username, password)) {
            System.out.println("Invalid credentials! Exiting...");
            return;
        }

        while (true) {
            System.out.println("\n1. View Rooms\n2. Book Room\n3. Checkout\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.displayRooms();
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    int roomNumber = scanner.nextInt();
                    hotel.bookRoom(roomNumber);
                    break;
                case 3:
                    System.out.print("Enter room number for checkout: ");
                    int checkoutRoom = scanner.nextInt();
                    hotel.checkout(checkoutRoom);
                    break;
                case 4:
                    System.out.println("Exiting Hotel Management System.");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
