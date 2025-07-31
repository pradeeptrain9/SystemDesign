package SOLID.DependencyInversionPriniciple;

public class MongoDb implements Database {

    @Override
    public void saveData(String data) {
        System.out.println("Saving data to MongoDB: " + data);
    }

    // Additional methods specific to MongoDB can be added here
}
