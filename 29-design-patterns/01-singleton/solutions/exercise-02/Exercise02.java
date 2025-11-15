package cours.java.designpatterns.singleton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Exercise02 {
    public static void main(String[] args) throws InterruptedException {
        // Créer plusieurs threads pour tester le thread-safety
        Thread[] threads = new Thread[3];
        
        for (int i = 0; i < 3; i++) {
            final int threadId = i;
            threads[i] = new Thread(() -> {
                ConfigCache cache = ConfigCache.getInstance();
                if (threadId == 0) {
                    System.out.println("Thread-0: Instance créée: " + cache);
                    cache.put("database.url", "jdbc:mysql://localhost:3306/app");
                } else if (threadId == 1) {
                    System.out.println("Thread-1: Instance utilisée: " + cache);
                    cache.put("app.name", "Mon Application");
                } else {
                    System.out.println("Thread-2: Instance utilisée: " + cache);
                    cache.put("app.version", "1.0.0");
                }
            });
        }
        
        // Démarrer tous les threads
        for (Thread thread : threads) {
            thread.start();
        }
        
        // Attendre que tous les threads terminent
        for (Thread thread : threads) {
            thread.join();
        }
        
        // Vérifier le cache
        ConfigCache cache = ConfigCache.getInstance();
        System.out.println("Configuration récupérée - app.name: " + cache.get("app.name"));
        System.out.println("Configuration vérifiée - contains 'database.url': " + cache.contains("database.url"));
    }
}

class ConfigCache {
    private static volatile ConfigCache instance;
    private final Map<String, String> cache;
    
    // Constructeur privé
    private ConfigCache() {
        cache = new ConcurrentHashMap<>();
    }
    
    // Double-Checked Locking pour thread-safety et performance
    public static ConfigCache getInstance() {
        if (instance == null) {
            synchronized (ConfigCache.class) {
                if (instance == null) {
                    instance = new ConfigCache();
                }
            }
        }
        return instance;
    }
    
    // Stocker une configuration
    public void put(String key, String value) {
        cache.put(key, value);
    }
    
    // Récupérer une configuration
    public String get(String key) {
        return cache.get(key);
    }
    
    // Vérifier l'existence d'une clé
    public boolean contains(String key) {
        return cache.containsKey(key);
    }
}
