public class Exercise02 {
    
    // TODO : Créer une exception AgeInvalideException
    // TODO : public static class AgeInvalideException extends RuntimeException {
    // TODO :     public AgeInvalideException(String message) {
    // TODO :         super(message);
    // TODO :     }
    // TODO : }
    
    // TODO : Créer une méthode qui lance l'exception
    // TODO : public static void verifierAge(int age) {
    // TODO :     if (age < 0 || age > 150) {
    // TODO :         throw new AgeInvalideException("Âge invalide : " + age + " (doit être entre 0 et 150)");
    // TODO :     }
    // TODO :     System.out.println("Âge valide : " + age);
    // TODO : }
    
    public static void main(String[] args) {
        // TODO : Tester avec un âge valide
        // TODO : try {
        // TODO :     verifierAge(25);
        // TODO : } catch (AgeInvalideException e) {
        // TODO :     System.out.println("Erreur : AgeInvalideException - " + e.getMessage());
        // TODO : }
        
        // TODO : Tester avec un âge invalide (négatif)
        // TODO : try {
        // TODO :     verifierAge(-5);
        // TODO : } catch (AgeInvalideException e) {
        // TODO :     System.out.println("Erreur : AgeInvalideException - " + e.getMessage());
        // TODO : }
        
        // TODO : Tester avec un âge invalide (trop élevé)
        // TODO : try {
        // TODO :     verifierAge(200);
        // TODO : } catch (AgeInvalideException e) {
        // TODO :     System.out.println("Erreur : AgeInvalideException - " + e.getMessage());
        // TODO : }
        
    }
}

