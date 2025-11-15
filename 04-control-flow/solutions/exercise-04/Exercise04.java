public class Exercise04 {
    public static void main(String[] args) {
        System.out.println("Boucle while (0 à 4) :");
        int compteur = 0;
        while (compteur < 5) {
            System.out.println(compteur);
            compteur++;
        }
        
        System.out.println("Puissances de 2 jusqu'à 1000 :");
        int puissance = 1;
        while (puissance <= 1000) {
            System.out.println(puissance);
            puissance *= 2;
        }
        
        int x = 10;
        do {
            System.out.println("Do-while s'exécute au moins une fois : " + x);
            x++;
        } while (x < 5);  // Condition fausse, mais do s'exécute quand même une fois
    }
}
