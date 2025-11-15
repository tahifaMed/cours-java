public class CompteBancaire {
    private double solde;
    private String titulaire;
    
    public CompteBancaire(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }
    
    public String getTitulaire() {
        return titulaire;
    }
    
    public double getSolde() {
        return solde;
    }
}
