package cours.java.designpatterns.dependencyinjection;

import java.util.HashMap;
import java.util.Map;

public class Exercise02 {
    public static void main(String[] args) {
        // Créer le conteneur
        IoCContainer container = new IoCContainer();
        
        // Enregistrer les beans
        container.register(Logger.class, new FileLogger());
        container.register(UserService.class, new UserService(container.getBean(Logger.class)));
        
        // Récupérer et utiliser
        UserService userService = container.getBean(UserService.class);
        userService.createUser("Alice");
        System.out.println();
        
        // Changer d'implémentation
        container.register(Logger.class, new ConsoleLogger());
        container.register(UserService.class, new UserService(container.getBean(Logger.class)));
        
        userService = container.getBean(UserService.class);
        userService.createUser("Bob");
    }
}

interface Logger {
    void log(String message);
}

class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[FILE] " + message);
    }
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[CONSOLE] " + message);
    }
}

class UserService {
    private Logger logger;
    
    public UserService(Logger logger) {
        this.logger = logger;
    }
    
    public void createUser(String name) {
        logger.log("Création d'utilisateur: " + name);
    }
}

class IoCContainer {
    private Map<Class<?>, Object> beans = new HashMap<>();
    
    public void register(Class<?> type, Object instance) {
        beans.put(type, instance);
    }
    
    @SuppressWarnings("unchecked")
    public <T> T getBean(Class<T> type) {
        return (T) beans.get(type);
    }
}
