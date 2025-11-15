public class Vehicule {
    String marque;
    int annee;
    
    public Vehicule(String marque, int annee) {
        this.marque = marque;
        this.annee = annee;
    }
    
    public void demarrer() {
        System.out.println("Le véhicule démarre");
    }
}
