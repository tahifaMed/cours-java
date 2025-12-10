package cours.java.designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        // Créer la première instance
//        System.out.println("Instance créée: " + LoggerSingleton.getInstance());
//
//        // Tenter de créer une deuxième instance (devrait retourner la même)
//        System.out.println("Instance utilisée: " + LoggerSingleton.getInstance());
        
        // Vérifier que c'est bien la même instance
        LoggerSingleton logger1 = LoggerSingleton.getInstance();
        LoggerSingleton logger2 = LoggerSingleton.getInstance();
        LoggerSingleton logger3 = LoggerSingleton.getInstance();
        LoggerSingleton logger4 = LoggerSingleton.getInstance();


        System.out.println("Instance créée: " + logger1);
        System.out.println("Instance utilisée: " + logger2);
        System.out.println("Instance utilisée: " + logger3);
        System.out.println("Instance utilisée: " + logger4);

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

    private static LoggerSingleton INSTANCE;
    private static int numberOfInstance = 3;

    private static int count =1;

    private LoggerSingleton() {

    }
    public static LoggerSingleton getInstance() {
        if (INSTANCE == null  || count <=numberOfInstance) {
            INSTANCE = new LoggerSingleton();
            count++;
            return INSTANCE;
        }
        return null;
    }

    public void logInfo(String message) {
        System.out.println("info : "+message);
    }
    public void logWarning(String message) {
        System.out.println("warning : "+message);
    }

    public void logError(String message) {
        System.out.println("error : "+message);
    }

}
