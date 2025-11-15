public class Forme {
    protected String couleur;
    
    public Forme(String couleur) {
        this.couleur = couleur;
    }
    
    public void dessiner() {
        System.out.println("Dessin d'une forme " + couleur);
    }
}
