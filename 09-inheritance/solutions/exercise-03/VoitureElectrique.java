public class VoitureElectrique extends Voiture {
    int autonomieBatterie;
    
    public VoitureElectrique(String marque, int annee, int nombrePortes, int autonomie) {
        super(marque, annee, nombrePortes);
        this.autonomieBatterie = autonomie;
    }
    
    @Override
    public void demarrer() {
        System.out.println("La voiture électrique démarre silencieusement");
    }
    
    public void charger() {
        System.out.println("Chargement de la batterie...");
    }
}
