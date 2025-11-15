public class Exercise01 {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("Alice", 1000.0);
        
        System.out.println("Titulaire : " + compte.getTitulaire());
        System.out.println("Solde : " + compte.getSolde());
        
        // compte.solde = 2000; // Erreur : solde has private access
    }
}
