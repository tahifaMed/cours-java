public class Voiture {
    String marque;
    String modele;
    int annee;
    
    public Voiture() {
        marque = "Inconnue";
        modele = "Inconnu";
        annee = 2020;
    }
    
    public Voiture(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }
    
    public void afficherInfo() {
        System.out.println(marque + " " + modele + " (" + annee + ")");
    }
}
