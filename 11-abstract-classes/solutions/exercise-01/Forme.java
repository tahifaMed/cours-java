public abstract class Forme {
    protected String couleur;
    
    public Forme(String couleur) {
        this.couleur = couleur;
    }
    
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public abstract double calculerAire();
    public abstract double calculerPerimetre();

    public abstract String volant();
}
