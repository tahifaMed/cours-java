public class Exercise03 {
    
    // TODO : Créer une classe Connexion
    // TODO : static class Connexion implements AutoCloseable {
    // TODO :     private boolean estOuverte;
    // TODO :     
    // TODO :     public Connexion() {
    // TODO :         this.estOuverte = true;
    // TODO :         System.out.println("Connexion ouverte");
    // TODO :     }
    // TODO :     
    // TODO :     public void executerRequete(String requete) {
    // TODO :         if (!estOuverte) {
    // TODO :             throw new IllegalStateException("La connexion est fermée");
    // TODO :         }
    // TODO :         System.out.println("Exécution de la requête " + requete);
    // TODO :     }
    // TODO :     
    // TODO :     @Override
    // TODO :     public void close() {
    // TODO :         if (estOuverte) {
    // TODO :             estOuverte = false;
    // TODO :             System.out.println("Connexion fermée automatiquement");
    // TODO :         }
    // TODO :     }
    // TODO : }
    
    public static void main(String[] args) {
        // TODO : Utiliser try-with-resources
        // TODO : try (Connexion conn = new Connexion()) {
        // TODO :     conn.executerRequete("SQL");
        // TODO : }
        
        // TODO : System.out.println("---");
        
        // TODO : Tester qu'on ne peut pas utiliser après fermeture
        // TODO : try (Connexion conn = new Connexion()) {
        // TODO :     conn.close();  // Fermeture manuelle
        // TODO :     System.out.println("Tentative d'utilisation après fermeture...");
        // TODO :     conn.executerRequete("SELECT * FROM table");
        // TODO : } catch (IllegalStateException e) {
        // TODO :     System.out.println("Erreur : " + e.getMessage());
        // TODO :     System.out.println("Connexion fermée automatiquement");
        // TODO : }
        
    }
}

