import java.util.HashMap;

public class User {
    private HashMap<String, String> users;

    public User() {
        users = new HashMap<>();
        users.put("admin", "admin123"); // Default admin user
    }

    public boolean login(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    public void register(String username, String password) {
        users.put(username, password);
        System.out.println("User registered successfully!");
    }
}
