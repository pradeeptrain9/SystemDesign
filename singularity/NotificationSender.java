public class NotificationSender {

    public static void main(String[] args) {
        // Create an instance of EmailNotification
        Notification email = new EmailNotification("Hello via Email!");
        Notification sms = new SmsNotification("Hello via SMS!");

        NotificationManager notificationManager = new NotificationManager();

        notificationManager.sendNotification(email,"This is an Email notification.");
        notificationManager.sendNotification(sms, "This is an SMS notification.");
    }
}
