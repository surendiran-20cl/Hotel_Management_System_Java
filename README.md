
# Hotel Management System

A Java-based Hotel Management System that allows users to view available rooms, book rooms, and manage customer checkouts. The project follows an Object-Oriented Programming (OOP) approach and uses VS Code for development.

## Features

- User Authentication (Login system)  
- Room Availability Check  
- Room Booking and Checkout  
- Billing System  
- Command-line Interface (CLI)  

## Project Structure

```
HotelManagementSystem/
│── src/
│   ├── User.java           # Handles user authentication
│   ├── Room.java           # Defines room properties
│   ├── Hotel.java          # Manages booking and billing
│   ├── HotelManagementSystem.java  # Main system logic
│── .gitignore
│── README.md
```

## Installation & Setup

### Prerequisites
- JDK (Java Development Kit) installed: [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)  
- VS Code with Java Extensions  
  - Install "Extension Pack for Java" in VS Code  

### Clone the Repository
```sh
git clone https://github.com/your-username/HotelManagementSystem.git
cd HotelManagementSystem
```

### Run the Project in VS Code

#### Using Terminal
```sh
cd src
javac *.java
java HotelManagementSystem
```

#### Using VS Code Debugger
1. Open `HotelManagementSystem.java`  
2. Click **Run → Run Without Debugging** (`Ctrl + F5`)  

## Usage Guide

1. Login with default credentials:  
   ```
   Username: admin
   Password: admin123
   ```
   
2. Select an option:  
   ```
   1. View Rooms
   2. Book Room
   3. Checkout
   4. Exit
   ```
   
3. Book a room:  
   ```
   Enter room number to book: 101
   Room 101 booked successfully!
   ```

4. Checkout and generate bill:  
   ```
   Enter room number for checkout: 101
   Checkout successful! Total Bill: $50.0
   ```

## Technologies Used
- Java (JDK 17)  
- VS Code  
- Git & GitHub  

## Future Enhancements
- Add Graphical User Interface (GUI)  
- Implement Database (JDBC & MySQL)  
- Include Admin Panel  
- Add Multiple User Roles (Admin, Guest, Staff)  

## Contributing
Contributions are welcome. Fork the repository and submit pull requests for improvements.

## License
This project is open-source and available under the MIT License.

## Author
- Name: Surendiran Shanmugasundaram
- Email: surendiran.shanmuga@gmail.com 
- GitHub: [Surendiran Shanmugasundaram](https://github.com/surendiran-20cl)
