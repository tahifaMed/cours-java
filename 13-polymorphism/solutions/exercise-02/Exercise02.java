public class Exercise02 {
    public static void main(String[] args) {
        Animal[] animaux = new Animal[3];
        
        animaux[0] = new Chien();
        animaux[1] = new Chat();
        animaux[2] = new Animal();
        
        for (Animal animal : animaux) {
            animal.faireDuBruit();  // Polymorphisme : chaque type exécute sa méthode
        }
    }
}
