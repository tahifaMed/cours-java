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

// TODO: Créer l'interface MessageService
// 1. Méthode: void sendMessage(String message)

// TODO: Implémenter EmailService, SMSService, PushService
// 1. Chaque implémente MessageService
// 2. EmailService affiche "📧 Email: [message]"
// 3. SMSService affiche "📱 SMS: [message]"
// 4. PushService affiche "🔔 Push: [message]"

// TODO: Créer NotificationService avec Constructor Injection
// 1. Stocke MessageService en privé
// 2. Constructeur prend MessageService
// 3. Méthode notify(String) appelle sendMessage
