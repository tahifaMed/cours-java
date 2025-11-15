public class Rectangle {
    double largeur;
    double hauteur;
    
    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    public double calculerAire() {
        return this.largeur * this.hauteur;
    }
    
    public void redimensionner(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    public void afficherInfo() {
        System.out.println("largeur=" + this.largeur + ", hauteur=" + this.hauteur);
    }
}
