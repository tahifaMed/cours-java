public class Exercise03 {
    public static void main(String[] args) {
        Volant volant1 = new Avion();   // Référence interface, objet Avion
        Volant volant2 = new Oiseau();  // Référence interface, objet Oiseau
        
        volant1.voler();  // Appelle la méthode de Avion
        volant2.voler();  // Appelle la méthode de Oiseau
    }
}
