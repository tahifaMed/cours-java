public abstract class Vehicule {
    String marque;
    int annee;
    
    public Vehicule(String marque, int annee) {
        this.marque = marque;
        this.annee = annee;
    }

    public abstract String volant();


    // TODO : Créer une méthode publique void demarrer()
    // TODO : Afficher "Le véhicule démarre"
    
}
