public class Cercle implements Constantes {
    double rayon;
    
    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    
    public double calculerAire() {
        return PI * rayon * rayon;
    }
    
    public void afficherMaxSize() {
        System.out.println("Taille maximale autorisée : " + MAX_SIZE);
    }
}
