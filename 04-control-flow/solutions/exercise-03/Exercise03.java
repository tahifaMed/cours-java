public class Exercise03 {
    public static void main(String[] args) {
        System.out.println("Boucle de 0 à 4 :");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        System.out.println("Boucle par pas de 2 (0 à 10) :");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        
        System.out.println("Boucle décroissante (10 à 1) :");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        
        int somme = 0;
        for (int i = 1; i <= 10; i++) {
            somme += i;
        }
        System.out.println("Somme de 1 à 10 : " + somme);
    }
}
