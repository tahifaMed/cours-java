public class Exercise02 {
    public static void main(String[] args) {
        int[] nombres = {10, 20, 30, 40, 50};
        
        System.out.print("Tableau initial : ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
        System.out.println();
        
        System.out.println("Premier élément : " + nombres[0]);
        System.out.println("Dernier élément : " + nombres[nombres.length - 1]);
        System.out.println("Élément à l'index 2 : " + nombres[2]);
        
        nombres[2] = 99;
        System.out.println("Après modification :");
        
        System.out.print("Tableau modifié : ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
        System.out.println();
    }
}
