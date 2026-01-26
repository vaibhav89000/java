
class DBConnection {
    private static DBConnection instance;

    private DBConnection() {
        // Private constructor to prevent instantiation
    }

    public static synchronized DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}

public class Synchronized {
    public static void main(String[] args) {
        DBConnection instance1 = DBConnection.getInstance();
        DBConnection instance2 = DBConnection.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}
