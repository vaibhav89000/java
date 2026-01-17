
interface NotificationChannel {
    void send(String message);
}

class EmailNotification implements NotificationChannel {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsNotification implements NotificationChannel {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

// New feature introduced — NO existing code modified ✅
class WhatsAppNotification implements NotificationChannel {
    public void send(String message) {
        System.out.println("WhatsApp sent: " + message);
    }
}

class NotificationService {
    private NotificationChannel channel;

    public NotificationService(NotificationChannel channel) {
        this.channel = channel;
    }

    void notifyUser(String message) {
        channel.send(message);
    }
}

public class NotificationWithDIP {
    public static void main(String[] args) {
        NotificationChannel channel = new WhatsAppNotification();
        NotificationService service = new NotificationService(channel);
        service.notifyUser("Ticket booked successfully");
    }
}
