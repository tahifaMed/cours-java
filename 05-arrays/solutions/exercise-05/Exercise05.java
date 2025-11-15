import java.util.Arrays;

public class Exercise05 {
    public static void main(String[] args) {
        int[] nombres = {50, 20, 40, 10, 30};
        
        System.out.println("Tableau original : " + Arrays.toString(nombres));
        
        Arrays.sort(nombres);
        System.out.println("Tableau trié : " + Arrays.toString(nombres));
        
        int index = Arrays.binarySearch(nombres, 30);
        System.out.println("Index de 30 dans le tableau trié : " + index);
        
        int[] tableauRempli = new int[5];
        Arrays.fill(tableauRempli, 100);
        System.out.println("Tableau rempli : " + Arrays.toString(tableauRempli));
        
        int[] copie = Arrays.copyOf(nombres, nombres.length);
        System.out.println("Copie du tableau : " + Arrays.toString(copie));
        
        int[] autre = {10, 20, 30, 40, 50};
        boolean egaux = Arrays.equals(nombres, autre);
        System.out.println("Les tableaux sont égaux : " + egaux);
    }
}
