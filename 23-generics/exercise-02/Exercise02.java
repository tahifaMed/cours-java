public class Exercise02 {
    
    // TODO : Créer une hiérarchie de classes
    // TODO : static class Animal {
    // TODO :     public void faireDuBruit() {
    // TODO :         System.out.println("L'animal fait du bruit");
    // TODO :     }
    // TODO : }
    // TODO : 
    // TODO : static class Chien extends Animal {
    // TODO :     @Override
    // TODO :     public void faireDuBruit() {
    // TODO :         System.out.println("Chien aboie");
    // TODO :     }
    // TODO : }
    // TODO : 
    // TODO : static class Chat extends Animal {
    // TODO :     @Override
    // TODO :     public void faireDuBruit() {
    // TODO :         System.out.println("Chat miaule");
    // TODO :     }
    // TODO : }
    
    // TODO : Méthode avec ? extends (lecture)
    // TODO : public static void afficherAnimaux(List<? extends Animal> animaux) {
    // TODO :     System.out.println("Animaux dans la liste :");
    // TODO :     for (Animal animal : animaux) {
    // TODO :         animal.faireDuBruit();
    // TODO :     }
    // TODO : }
    
    // TODO : Méthode avec ? super (écriture)
    // TODO : public static void ajouterChien(List<? super Chien> animaux) {
    // TODO :     animaux.add(new Chien());
    // TODO :     System.out.println("Peut ajouter un Chien à la liste");
    // TODO : }
    
    public static void main(String[] args) {
        // TODO : Créer des listes
        // TODO : List<Animal> animaux = new ArrayList<>();
        // TODO : animaux.add(new Chien());
        // TODO : animaux.add(new Chat());
        
        // TODO : Utiliser ? extends
        // TODO : afficherAnimaux(animaux);
        
        // TODO : Utiliser ? super
        // TODO : List<Animal> animauxPourAjout = new ArrayList<>();
        // TODO : animauxPourAjout.add(new Chien());
        // TODO : ajouterChien(animauxPourAjout);
        // TODO : System.out.println("Liste après ajout : " + animauxPourAjout);
        
    }
}

