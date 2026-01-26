
class DBConnection {
    private static final DBConnection instance = new DBConnection();

    private DBConnection() {
        // Private constructor to prevent instantiation
    }

    public static DBConnection getInstance() {
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database.");
    }
}

public class Eager {
    public static void main(String[] args) {
        DBConnection instance1 = DBConnection.getInstance();
        DBConnection instance2 = DBConnection.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }   
}
