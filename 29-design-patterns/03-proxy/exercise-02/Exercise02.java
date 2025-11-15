package cours.java.designpatterns.proxy;

public class Exercise02 {
    public static void main(String[] args) {
        // Créer un compte proxy utilisateur normal
        CompteBancaire compteUser = new CompteProxy(100.0, "USER");
        compteUser.deposer(500.0);
        System.out.println();
        
        double solde = compteUser.getSolde();
        System.out.println("Solde actuel: " + solde + "€");
        System.out.println();
        
        // Tenter un retrait (interdit pour USER)
        compteUser.retirer(100.0);
        compteUser.deposer(200.0);
        System.out.println();
        
        // Créer un compte proxy ADMIN
        CompteBancaire compteAdmin = new CompteProxy(100.0, "ADMIN");
        compteAdmin.retirer(100.0);
        compteAdmin.deposer(50.0);
    }
}

// TODO: Créer l'interface CompteBancaire
// 1. Méthodes: retirer(double), deposer(double), getSolde()

// TODO: Créer CompteReel
// 1. Implémente CompteBancaire
// 2. Stocke le solde en double
// 3. Implémenter toutes les méthodes

// TODO: Créer CompteProxy
// 1. Implémente CompteBancaire
// 2. Stocke CompteReel et String role
// 3. Dans retirer(): vérifier si role == "ADMIN", sinon "Accès refusé"
// 4. Dans deposer(): toujours autorisé
