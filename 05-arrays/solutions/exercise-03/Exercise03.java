public class Exercise03 {
    public static void main(String[] args) {
        int[] nombres = {10, 20, 30, 40, 50};
        
        System.out.println("Parcours avec for classique :");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
        System.out.println();
        
        System.out.println("Parcours avec for-each :");
        for (int n : nombres) {
            System.out.print(n + " ");
        }
        System.out.println();
        
        int somme = 0;
        for (int n : nombres) {
            somme += n;
        }
        System.out.println("Somme des éléments : " + somme);
        
        int max = nombres[0];
        for (int i = 1; i < nombres.length; i++) {
            if (nombres[i] > max) {
                max = nombres[i];
            }
        }
        System.out.println("Maximum : " + max);
    }
}
