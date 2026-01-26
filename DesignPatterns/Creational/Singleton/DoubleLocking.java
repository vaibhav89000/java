
class DBConnection {
    private static volatile DBConnection instance;

    private DBConnection() {
        // Private constructor to prevent instantiation
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}

public class DoubleLocking {
    public static void main(String[] args) {
        DBConnection instance1 = DBConnection.getInstance();
        DBConnection instance2 = DBConnection.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}