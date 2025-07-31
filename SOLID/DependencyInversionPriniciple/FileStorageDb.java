package SOLID.DependencyInversionPriniciple;

public class FileStorageDb implements Database {

    @Override
    public void saveData(String data) {
        System.out.println("Saving data to File Storage: " + data);
    }

    // Additional methods specific to File Storage can be added here
}
