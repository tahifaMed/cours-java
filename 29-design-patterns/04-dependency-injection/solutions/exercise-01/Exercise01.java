package cours.java.designpatterns.dependencyinjection;

public class Exercise01 {
    public static void main(String[] args) {
        // Créer les services
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();
        
        // Injecter EmailService
        NotificationService notification1 = new NotificationService(emailService);
        notification1.notify("Bienvenue dans notre application");
        System.out.println();
        
        // Injecter SMSService
        NotificationService notification2 = new NotificationService(smsService);
        notification2.notify("Code de vérification: 123456");
        System.out.println();
        
        // Utiliser un autre service
        MessageService pushService = new PushService();
        NotificationService notification3 = new NotificationService(pushService);
        notification3.notify("Nouveau message reçu");
    }
}

interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("📧 Email: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("📱 SMS: " + message);
    }
}

class PushService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("🔔 Push: " + message);
    }
}

class NotificationService {
    private MessageService messageService;
    
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }
    
    public void notify(String message) {
        messageService.sendMessage(message);
    }
}
