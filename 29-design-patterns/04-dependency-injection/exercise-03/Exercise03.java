package cours.java.designpatterns.dependencyinjection;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Exercise03 {
    public static void main(String[] args) {
        // Créer le conteneur
        SpringLikeContainer container = new SpringLikeContainer();
        
        // Enregistrer les beans
        container.register(Logger.class, new ConsoleLogger());
        container.register(EmailService.class, new EmailService());
        
        // Créer et enregistrer OrderService
        OrderService orderService = new OrderService();
        container.register(OrderService.class, orderService);
        
        // Injecter les dépendances
        container.injectDependencies();
        
        // Utiliser
        orderService.processOrder("ORD-123");
    }
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Autowired {
}

interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

class EmailService {
    public void send(String to, String message) {
        System.out.println("Email envoyé à " + to + ": " + message);
    }
}

// TODO: Créer OrderService avec Field Injection
// 1. Champs Logger et EmailService annotés @Autowired
// 2. Méthode processOrder(String orderId) utilise les dépendances

// TODO: Créer SpringLikeContainer
// 1. Map pour stocker les beans
// 2. register(), getBean(), injectDependencies()
// 3. injectDependencies() utilise la réflexion pour injecter via @Autowired
