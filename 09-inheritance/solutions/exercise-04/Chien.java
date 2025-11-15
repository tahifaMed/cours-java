public class Chien extends Animal {
    public Chien(String nom) {
        super(nom);
    }
    
    @Override
    public void sePresenter() {
        System.out.println("Je suis un chien, je m'appelle " + nom);
    }
}
