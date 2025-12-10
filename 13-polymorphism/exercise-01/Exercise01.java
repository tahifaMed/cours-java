public class Exercise01 {
    public static void main(String[] args) {
        // TODO : Créer une référence Animal pointant vers un objet Chien
        Animal animal1 = new Chien();
        // TODO : Créer une référence Animal pointant vers un objet Chat
        Animal animal2 = new Chat();
        
        // TODO : Appeler faireDuBruit() sur animal1
        // TODO : La méthode de Chien sera appelée (polymorphisme)
        animal1.faireDuBruit();
        // TODO : Appeler faireDuBruit() sur animal2
        // TODO : La méthode de Chat sera appelée
        animal2.faireDuBruit();
    }
}
