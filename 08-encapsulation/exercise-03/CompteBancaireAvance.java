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
    
    // TODO : Créer un getter public double getSolde()
    
    // TODO : Créer un getter public String getTitulaire()
    
    // TODO : Créer une méthode publique void deposer(double montant)
    // TODO : Valider que montant > 0
    // TODO : Si valide, ajouter montant à solde
    
    // TODO : Créer une méthode publique boolean retirer(double montant)
    // TODO : Valider que montant > 0
    // TODO : Valider que montant <= solde
    // TODO : Si valide, soustraire montant de solde et retourner true
    // TODO : Sinon, retourner false
    
}
