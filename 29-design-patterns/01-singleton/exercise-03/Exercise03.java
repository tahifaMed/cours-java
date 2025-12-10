package cours.java.designpatterns.singleton;

public class Exercise03 {
    public static void main(String[] args) {
        // Récupérer l'instance unique du pool
        ConnectionPool pool = ConnectionPool.INSTANCE;
        
//        System.out.println("Pool initialisé avec " + pool.getMaxSize() + " connexions max ");
//
//        // Acquérir des connexions
//        String conn1 = pool.acquireConnection();
//        System.out.println("Acquisition: " + conn1);
//
//        String conn2 = pool.acquireConnection();
//        System.out.println("Acquisition: " + conn2);
//
//        String conn3 = pool.acquireConnection();
//        System.out.println("Acquisition: " + conn3);
//
//        // Tenter d'acquérir une connexion supplémentaire
//        System.out.println(" Tentative d'acquisition lorsque le pool est plein...");
//        String conn4 = pool.acquireConnection();
//        if (conn4 == null) {
//            System.out.println("Échec: Pool plein!");
//        }
        
        // Libérer une connexion
//        System.out.println(" Libération: " + conn1);
//        pool.releaseConnection(conn1);
//
//        // Acquérir une nouvelle connexion
//        conn4 = pool.acquireConnection();
//        System.out.println("Acquisition: " + conn4);
//
//        // Afficher l'état
//        System.out.println(" État du pool: " + pool.getStatus());
//
//        // Libérer toutes les connexions
//        pool.releaseConnection(conn2);
//        pool.releaseConnection(conn3);
//        pool.releaseConnection(conn4);
//
//        // Afficher l'état final
//        System.out.println(" Libération: " + conn2);
//        System.out.println("Libération: " + conn3);
//        System.out.println("Libération: " + conn4);
//        System.out.println(" État du pool: " + pool.getStatus());
    }
}

// TODO: Implémenter le pattern Singleton avec un enum
// 1. Créer un enum ConnectionPool avec INSTANCE
// 2. Ajouter des champs pour maxSize, connectionCount, activeConnections
// 3. Ajouter un constructeur pour initialiser maxSize à 3
// 4. Implémenter acquireConnection() qui retourne "CONN-X" ou null si pool plein
// 5. Implémenter releaseConnection(String) pour libérer une connexion
// 6. Implémenter getStatus() qui retourne l'état actuel
// 7. Implémenter getMaxSize() pour retourner la taille max

enum ConnectionPool {
    INSTANCE;
    
    // TODO: Ajouter votre code ici
}
