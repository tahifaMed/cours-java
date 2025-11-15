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

interface CompteBancaire {
    void retirer(double montant);
    void deposer(double montant);
    double getSolde();
}

class CompteReel implements CompteBancaire {
    private double solde;
    
    public CompteReel(double soldeInitial) {
        this.solde = soldeInitial;
    }
    
    @Override
    public void retirer(double montant) {
        solde -= montant;
        System.out.println("Retrait: " + montant + "€ - Solde: " + solde + "€");
    }
    
    @Override
    public void deposer(double montant) {
        solde += montant;
        System.out.println("Dépôt: " + montant + "€ - Solde: " + solde + "€");
    }
    
    @Override
    public double getSolde() {
        return solde;
    }
}

class CompteProxy implements CompteBancaire {
    private CompteReel compteReel;
    private String role;
    
    public CompteProxy(double soldeInitial, String role) {
        this.compteReel = new CompteReel(soldeInitial);
        this.role = role;
    }
    
    @Override
    public void retirer(double montant) {
        if ("ADMIN".equals(role)) {
            compteReel.retirer(montant);
        } else {
            System.out.println("Retrait de " + montant + "€ refusé (permissions insuffisantes)");
        }
    }
    
    @Override
    public void deposer(double montant) {
        compteReel.deposer(montant);
    }
    
    @Override
    public double getSolde() {
        return compteReel.getSolde();
    }
}
