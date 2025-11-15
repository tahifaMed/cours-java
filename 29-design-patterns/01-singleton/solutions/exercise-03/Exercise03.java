package cours.java.designpatterns.singleton;

public class Exercise03 {
    public static void main(String[] args) {
        // Récupérer l'instance unique du pool
        ConnectionPool pool = ConnectionPool.INSTANCE;
        
        System.out.println("Pool initialisé avec " + pool.getMaxSize() + " connexions max ");
        
        // Acquérir des connexions
        String conn1 = pool.acquireConnection();
        System.out.println("Acquisition: " + conn1);
        
        String conn2 = pool.acquireConnection();
        System.out.println("Acquisition: " + conn2);
        
        String conn3 = pool.acquireConnection();
        System.out.println("Acquisition: " + conn3);
        
        // Tenter d'acquérir une connexion supplémentaire
        System.out.println(" Tentative d'acquisition lorsque le pool est plein...");
        String conn4 = pool.acquireConnection();
        if (conn4 == null) {
            System.out.println("Échec: Pool plein!");
        }
        
        // Libérer une connexion
        System.out.println(" Libération: " + conn1);
        pool.releaseConnection(conn1);
        
        // Acquérir une nouvelle connexion
        conn4 = pool.acquireConnection();
        System.out.println("Acquisition: " + conn4);
        
        // Afficher l'état
        System.out.println(" État du pool: " + pool.getStatus());
        
        // Libérer toutes les connexions
        pool.releaseConnection(conn2);
        pool.releaseConnection(conn3);
        pool.releaseConnection(conn4);
        
        // Afficher l'état final
        System.out.println(" Libération: " + conn2);
        System.out.println("Libération: " + conn3);
        System.out.println("Libération: " + conn4);
        System.out.println(" État du pool: " + pool.getStatus());
    }
}

enum ConnectionPool {
    INSTANCE;
    
    private final int maxSize;
    private int connectionCount;
    private int activeConnections;
    
    // Constructeur privé par défaut pour les enums
    ConnectionPool() {
        this.maxSize = 3;
        this.connectionCount = 0;
        this.activeConnections = 0;
    }
    
    public int getMaxSize() {
        return maxSize;
    }
    
    // Acquérir une connexion
    public synchronized String acquireConnection() {
        if (activeConnections >= maxSize) {
            return null;
        }
        connectionCount++;
        activeConnections++;
        return "CONN-" + connectionCount;
    }
    
    // Libérer une connexion
    public synchronized void releaseConnection(String connection) {
        if (activeConnections > 0) {
            activeConnections--;
        }
    }
    
    // Obtenir l'état du pool
    public synchronized String getStatus() {
        return "Disponibles: " + (maxSize - activeConnections) + 
               ", En utilisation: " + activeConnections;
    }
}
