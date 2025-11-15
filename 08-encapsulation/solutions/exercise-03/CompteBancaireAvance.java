public class CompteBancaireAvance {
    private double solde;
    private String titulaire;
    
    public CompteBancaireAvance(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        if (soldeInitial >= 0) {
            this.solde = soldeInitial;
        } else {
            this.solde = 0;
        }
    }
    
    public double getSolde() {
        return solde;
    }
    
    public String getTitulaire() {
        return titulaire;
    }
    
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }
    
    public boolean retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            return true;
        }
        return false;
    }
}
