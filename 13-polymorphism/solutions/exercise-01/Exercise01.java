public class Exercise01 {
    public static void main(String[] args) {
        Animal animal1 = new Chien();  // Référence Animal, objet Chien
        Animal animal2 = new Chat();   // Référence Animal, objet Chat
        
        animal1.faireDuBruit();  // Appelle la méthode de Chien
        animal2.faireDuBruit();  // Appelle la méthode de Chat
    }
}
