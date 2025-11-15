public class Exercise02 {
    
    // TODO : Créer une classe Ressource qui implémente AutoCloseable
    // TODO : static class Ressource implements AutoCloseable {
    // TODO :     public Ressource() {
    // TODO :         System.out.println("Ressource créée");
    // TODO :     }
    // TODO :     
    // TODO :     public void utiliser() {
    // TODO :         System.out.println("Utilisation de la ressource");
    // TODO :     }
    // TODO :     
    // TODO :     @Override
    // TODO :     public void close() {
    // TODO :         System.out.println("Ressource fermée automatiquement");
    // TODO :     }
    // TODO : }
    
    public static void main(String[] args) {
        // TODO : Utiliser try-with-resources (cas normal)
        // TODO : try (Ressource res = new Ressource()) {
        // TODO :     res.utiliser();
        // TODO : }
        
        // TODO : System.out.println("---");
        
        // TODO : Utiliser try-with-resources avec exception
        // TODO : try (Ressource res = new Ressource()) {
        // TODO :     res.utiliser();
        // TODO :     throw new RuntimeException("Exception dans le bloc try");
        // TODO : } catch (RuntimeException e) {
        // TODO :     System.out.println(e.getMessage());
        // TODO :     System.out.println("Ressource fermée automatiquement (même avec exception)");
        // TODO : }
        
    }
}

