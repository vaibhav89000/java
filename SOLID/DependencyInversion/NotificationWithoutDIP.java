
// “Earlier, NotificationService was directly dependent on Email and SMS classes.
// When WhatsApp was introduced, we had to modify NotificationService, violating DIP.
// By introducing a NotificationChannel interface, both high-level and low-level modules now depend on abstraction.
// Adding WhatsApp required only a new class, without touching existing logic.”

class EmailService {
    void sendEmail(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsService {
    void sendSms(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationService {
    private EmailService emailService = new EmailService();
    private SmsService smsService = new SmsService();

    void notifyUser(String type, String message) {
        if ("EMAIL".equals(type)) {
            emailService.sendEmail(message);
        } else if ("SMS".equals(type)) {
            smsService.sendSms(message);
        }
        // NOW WhatsApp comes → modify this class ❌
    }
}

public class NotificationWithoutDIP {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.notifyUser("EMAIL", "Booking confirmed");
    }
}
