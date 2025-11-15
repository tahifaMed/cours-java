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

interface DatabaseConnection {
    void connecter();
    String getType();
}

abstract class DatabaseFactory {
    // Factory Method
    abstract DatabaseConnection creerConnexion();
    
    public void testerConnexion() {
        DatabaseConnection connection = creerConnexion();
        connection.connecter();
    }
}

class MySqlConnection implements DatabaseConnection {
    @Override
    public void connecter() {
        System.out.println("Connexion établie à MySQL");
    }
    
    @Override
    public String getType() {
        return "MySQL";
    }
}

class PostgreSqlConnection implements DatabaseConnection {
    @Override
    public void connecter() {
        System.out.println("Connexion établie à PostgreSQL");
    }
    
    @Override
    public String getType() {
        return "PostgreSQL";
    }
}

class MySqlFactory extends DatabaseFactory {
    @Override
    public DatabaseConnection creerConnexion() {
        return new MySqlConnection();
    }
}

class PostgreSqlFactory extends DatabaseFactory {
    @Override
    public DatabaseConnection creerConnexion() {
        return new PostgreSqlConnection();
    }
}
