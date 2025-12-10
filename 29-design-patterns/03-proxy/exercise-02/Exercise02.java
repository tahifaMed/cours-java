package cours.java.designpatterns.proxy;

public class Exercise02 {
    public static void main(String[] args) {
        // Créer un compte proxy utilisateur normal
        CompteBancaire compteUser = new CompteProxy(100.0, "BANQUIER");
        compteUser.deposer(500.0);
        System.out.println();
        
        double solde = compteUser.getSolde();
        System.out.println("Solde actuel: " + solde + "€");
        System.out.println();
        
        // Tenter un retrait (interdit pour USER)
        compteUser.retirer(100.00);
        compteUser.deposer(200.0);
        System.out.println(compteUser.getSolde());
        
        // Créer un compte proxy ADMIN
//        CompteBancaire compteAdmin = new CompteProxy(100.0, "ADMIN");
//        compteAdmin.retirer(100.0);
//        compteAdmin.deposer(50.0);
    }
}

// TODO: Créer l'interface CompteBancaire
// 1. Méthodes: retirer(double), deposer(double), getSolde()

interface CompteBancaire {
    double getSolde();
    void deposer(double solde);
    void retirer(double solde);
}

// TODO: Créer CompteReel
// 1. Implémente CompteBancaire
// 2. Stocke le solde en double
// 3. Implémenter toutes les méthodes

class CompteReel implements CompteBancaire {
    private double solde;
    public CompteReel(double solde) {
        this.solde = solde;
    }
    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public void deposer(double montant) {
        this.solde += montant;
    }

    @Override
    public void retirer(double montant) {
        this.solde -= montant;
    }
}

// TODO: Créer CompteProxy
// 1. Implémente CompteBancaire
// 2. Stocke CompteReel et String role
// 3. Dans retirer(): vérifier si role == "ADMIN", sinon "Accès refusé"
// 4. Dans deposer(): toujours autorisé


class CompteProxy implements CompteBancaire {

    private String role;
    private CompteBancaire compteBancaire;

    public CompteProxy(double solde, String role) {
        this.role = role;
        if(role.equals("BANQUIER") ) {
            this.compteBancaire = new CompteReel(solde);
        }
    }

    public double getSolde() {
        if(role.equals("BANQUIER")) {
            return compteBancaire.getSolde();
        }
        return 0L;
    }
    @Override
    public void deposer(double montant) {
        if(role.equals("BANQUIER")) {
            compteBancaire.deposer(montant);
        }
    }

    @Override
    public void retirer(double montant) {
        if(role.equals("BANQUIER")) {
            compteBancaire.retirer(montant);
        }
    }
}
