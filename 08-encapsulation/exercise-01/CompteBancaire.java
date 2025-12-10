public class CompteBancaire {
    // TODO : Rendre ces attributs privés avec le mot-clé private
    // TODO : private double solde;
    // TODO : private String titulaire;
    private double amount;
    private String titulaire;

    public double getSolde() {
        return amount;
    }

    public void setSolde(double solde) {
        this.amount = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    // TODO : Créer un constructeur public CompteBancaire(String titulaire, double soldeInitial)
    // TODO : Initialiser this.titulaire et this.solde
    
    // TODO : Créer une méthode publique String getTitulaire() qui retourne le titulaire
    
    // TODO : Créer une méthode publique double getSolde() qui retourne le solde
    
}
