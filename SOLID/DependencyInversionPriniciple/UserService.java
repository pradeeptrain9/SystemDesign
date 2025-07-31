package SOLID.DependencyInversionPriniciple;

public class UserService {

    public void saveUser(Database database, String userData) {
        // Use the database to save user data
        database.saveData(userData);
    }

    public static void main(String[] args) {
        // Example usage
        Database mongoDb = new MongoDb();
        Database fileStorageDb = new FileStorageDb();

        UserService userService = new UserService();

        userService.saveUser(mongoDb, "User data for MongoDB");
        userService.saveUser(fileStorageDb, "User data for File Storage");
    }

}
