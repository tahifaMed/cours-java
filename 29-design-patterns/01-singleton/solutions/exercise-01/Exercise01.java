package cours.java.designpatterns.singleton;

public class Exercise01 {
    public static void main(String[] args) {
        // Créer la première instance
        System.out.println("Instance créée: " + LoggerSingleton.getInstance());
        
        // Tenter de créer une deuxième instance (devrait retourner la même)
        System.out.println("Instance utilisée: " + LoggerSingleton.getInstance());
        
        // Vérifier que c'est bien la même instance
        LoggerSingleton logger1 = LoggerSingleton.getInstance();
        LoggerSingleton logger2 = LoggerSingleton.getInstance();
        
        System.out.println("Instance créée: " + logger1);
        System.out.println("Instance utilisée: " + logger2);
        
        // Utiliser le logger
        logger1.logInfo("Application démarrée");
        logger2.logWarning("Mémoire faible détectée");
        logger1.logError("Échec de connexion à la base de données");
        logger2.logInfo("Application arrêtée");
    }
}

class LoggerSingleton {
    // Instance unique créée dès le chargement de la classe (Eager Initialization)
    private static final LoggerSingleton instance = new LoggerSingleton();
    
    // Constructeur privé pour empêcher l'instanciation directe
    private LoggerSingleton() {
    }
    
    // Méthode statique pour accéder à l'instance unique
    public static LoggerSingleton getInstance() {
        return instance;
    }
    
    // Méthode générique pour logger
    public void log(String level, String message) {
        System.out.println("[" + level + "] - " + message);
    }
    
    // Méthodes de commodité
    public void logInfo(String message) {
        log("INFO", message);
    }
    
    public void logWarning(String message) {
        log("WARNING", message);
    }
    
    public void logError(String message) {
        log("ERROR", message);
    }
}
