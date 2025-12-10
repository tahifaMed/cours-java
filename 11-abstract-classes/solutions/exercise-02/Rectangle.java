public class Rectangle extends Forme {
    private double largeur;
    private double hauteur;
    
    public Rectangle(String couleur, double largeur, double hauteur) {
        super(couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    

    public double calculerAire() {
        return largeur * hauteur;
    }
    

    public double calculerPerimetre() {
        return 2 * (largeur + hauteur);
    }
}
