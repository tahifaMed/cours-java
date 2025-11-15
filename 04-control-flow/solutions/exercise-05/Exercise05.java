public class Exercise05 {
    public static void main(String[] args) {
        System.out.println("Boucle avec break (s'arrête à 5) :");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        
        System.out.println("Boucle avec continue (affiche seulement les pairs) :");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;  // Ignore les nombres impairs
            }
            System.out.println(i);
        }
        
        int[] tableau = {3, 5, 2, 8, 1, 9, 4, 7, 6, 0};
        int valeurRecherchee = 7;
        
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                System.out.println("Recherche terminée : nombre " + valeurRecherchee + " trouvé à l'index " + i);
                break;  // Sort de la boucle une fois trouvé
            }
        }
    }
}
