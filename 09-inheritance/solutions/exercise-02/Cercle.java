public class Cercle extends Forme {
    private double rayon;
    
    public Cercle(String couleur, double rayon) {
        super(couleur);
        this.rayon = rayon;
    }
    
    @Override
    public void dessiner() {
        super.dessiner();
        System.out.println("C'est un cercle de rayon " + rayon);
    }
    
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }
}
