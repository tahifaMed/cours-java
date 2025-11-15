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

// TODO: Implémenter le pattern Singleton pour LoggerSingleton
// 1. Ajouter une variable static final pour stocker l'instance
// 2. Rendre le constructeur privé
// 3. Ajouter une méthode getInstance() statique
// 4. Implémenter la méthode log(String level, String message)
// 5. Implémenter les méthodes de commodité : logInfo, logWarning, logError

class LoggerSingleton {
    // TODO: Ajouter votre code ici
}
