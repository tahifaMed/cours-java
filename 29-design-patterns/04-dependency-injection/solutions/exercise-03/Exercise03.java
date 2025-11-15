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

class OrderService {
    @Autowired
    private Logger logger;
    
    @Autowired
    private EmailService emailService;
    
    public void processOrder(String orderId) {
        logger.log("Traitement de la commande " + orderId);
        emailService.send("customer@example.com", "Votre commande " + orderId + " a été traitée");
        logger.log("Commande " + orderId + " traitée avec succès");
    }
}

class SpringLikeContainer {
    private Map<Class<?>, Object> beans = new HashMap<>();
    
    public void register(Class<?> type, Object instance) {
        beans.put(type, instance);
    }
    
    @SuppressWarnings("unchecked")
    public <T> T getBean(Class<T> type) {
        return (T) beans.get(type);
    }
    
    public void injectDependencies() {
        for (Object bean : beans.values()) {
            Field[] fields = bean.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(Autowired.class)) {
                    field.setAccessible(true);
                    try {
                        Object dependency = getBean(field.getType());
                        field.set(bean, dependency);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
