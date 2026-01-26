
class DBConnection{
    private static DBConnection instance;

    private DBConnection() {
        // Private constructor to prevent instantiation
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database.");
    }
}

public class Lazy {
    public static void main(String[] args) {
        DBConnection instance1 = DBConnection.getInstance();
        DBConnection instance2 = DBConnection.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }   
}
