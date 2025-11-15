public class Voiture extends Vehicule {
    int nombrePortes;
    
    public Voiture(String marque, int annee, int nombrePortes) {
        super(marque, annee);
        this.nombrePortes = nombrePortes;
    }
    
    @Override
    public void demarrer() {
        System.out.println("La voiture démarre avec la clé");
    }
}
