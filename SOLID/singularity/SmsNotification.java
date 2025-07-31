package SOLID.singularity;

public class SmsNotification implements Notification {

    public SmsNotification(String message) {
        // Simulate sending an SMS notification
        System.out.println("SMS sent with message: " + message);
    }

    @Override
    public void send(String message) {
        // This method is not used in this class, but must be implemented
        // because SOLID.singularity.SmsNotification extends SOLID.singularity.Notification
        System.out.println("Sending SMS with message: " + message);
    }
}
