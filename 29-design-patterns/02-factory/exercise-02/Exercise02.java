package cours.java.designpatterns.factory;

public class Exercise02 {
    public static void main(String[] args) {
        // Créer une factory MySQL
        DatabaseFactory mysqlFactory = new MySqlFactory();
        System.out.println("Factory MySQL créée");
        
        // Créer et utiliser une connexion MySQL
        DatabaseConnection mysqlConn = mysqlFactory.creerConnexion();
        System.out.println("Connexion MySQL créée");
        mysqlConn.connecter();
        System.out.println();
        
        // Créer une factory PostgreSQL
        DatabaseFactory pgFactory = new PostgreSqlFactory();
        System.out.println("Factory PostgreSQL créée");
        
        // Créer et utiliser une connexion PostgreSQL
        DatabaseConnection pgConn = pgFactory.creerConnexion();
        System.out.println("Connexion PostgreSQL créée");
        pgConn.connecter();
        System.out.println();
        
        // Tester les connexions via les factories
        System.out.println("Test de connexion MySQL:");
        mysqlFactory.testerConnexion();
        System.out.println();
        
        System.out.println("Test de connexion PostgreSQL:");
        pgFactory.testerConnexion();
    }
}

// TODO: Créer l'interface DatabaseConnection
// 1. Méthode connecter() qui affiche "Connexion établie à [TYPE]"
// 2. Méthode getType() qui retourne le type de base de données

// TODO: Créer la classe abstraite DatabaseFactory
// 1. Méthode abstraite DatabaseConnection creerConnexion()
// 2. Méthode concrète testerConnexion() qui utilise creerConnexion()

// TODO: Implémenter MySqlFactory et PostgreSqlFactory
// 1. Each extends DatabaseFactory
// 2. Override creerConnexion() pour retourner le bon type

// TODO: Implémenter MySqlConnection et PostgreSqlConnection
// 1. Each implements DatabaseConnection
// 2. Implement connecter() and getType()

