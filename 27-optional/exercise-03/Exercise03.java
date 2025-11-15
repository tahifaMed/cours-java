public class Exercise03 {
    
    // TODO : Méthode qui retourne Optional au lieu de null
    // TODO : public static Optional<String> trouverNom(int id) {
    // TODO :     if (id == 1) {
    // TODO :         return Optional.of("Alice");
    // TODO :     } else if (id == 2) {
    // TODO :         return Optional.of("Bob");
    // TODO :     } else {
    // TODO :         return Optional.empty();
    // TODO :     }
    // TODO : }
    
    public static void main(String[] args) {
        // TODO : Utiliser la méthode avec Optional
        // TODO : Optional<String> nom1 = trouverNom(1);
        // TODO : System.out.println("Nom trouvé : " + nom1.orElse("Inconnu"));
        
        // TODO : Utiliser orElse() pour valeur par défaut
        // TODO : Optional<String> nom2 = trouverNom(999);
        // TODO : System.out.println("Nom par défaut : " + nom2.orElse("Inconnu"));
        
        // TODO : Utiliser map() et ifPresent()
        // TODO : Optional<String> nom3 = trouverNom(1);
        // TODO : nom3.map(String::length)
        // TODO :     .ifPresent(len -> System.out.println("Le nom existe et sa longueur est : " + len));
        
        // TODO : Vérifier avec isEmpty()
        // TODO : if (trouverNom(999).isEmpty()) {
        // TODO :     System.out.println("Aucun nom trouvé");
        // TODO : }
        
    }
}

