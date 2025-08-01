package SOLID.singularity;

public class EmailNotification implements Notification {

    public EmailNotification(String message){
        // Simulate sending an email notification
        System.out.println("Email sent with message: " + message);
    }

    @Override
    public void send(String message) {
        // This method is not used in this class, but must be implemented
        // because SOLID.singularity.EmailNotification extends SOLID.singularity.Notification
        System.out.println("Sending email with message: " + message);
    }
}
