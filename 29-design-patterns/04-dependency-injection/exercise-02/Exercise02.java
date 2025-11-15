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

// TODO: Créer UserService avec Constructor Injection
// 1. Stocke Logger en privé
// 2. Constructeur prend Logger
// 3. Méthode createUser(String name) appelle logger.log()

// TODO: Créer IoCContainer
// 1. Map<Class<?>, Object> pour stocker les beans
// 2. register(Class<?> type, Object instance) pour enregistrer
// 3. <T> T getBean(Class<T> type) pour récupérer
