public class Exercise04 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.sePresenter();
        
        Chien chien = new Chien("Rex");
        chien.sePresenter();
        
        Chat chat = new Chat("Minou");
        chat.sePresenter();
    }
}
