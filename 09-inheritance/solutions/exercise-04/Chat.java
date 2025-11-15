public class Chat extends Animal {
    public Chat(String nom) {
        super(nom);
    }
    
    @Override
    public void sePresenter() {
        System.out.println("Je suis un chat, je m'appelle " + nom);
    }
}
