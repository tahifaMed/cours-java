public class Cercle extends Forme {
    private double rayon;
    
    public Cercle(String couleur, double rayon) {
        super(couleur);
        this.rayon = rayon;
    }
    

    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
}
