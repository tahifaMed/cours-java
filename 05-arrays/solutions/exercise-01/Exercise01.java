public class Exercise01 {
    public static void main(String[] args) {
        int[] nombres = new int[5];
        
        System.out.println("Tableau d'entiers (taille 5) :");
        System.out.println("Longueur : " + nombres.length);
        System.out.print("Éléments : ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
        System.out.println();
        
        String[] langages = {"Java", "Python", "C++"};
        
        System.out.println("Tableau de langages :");
        System.out.println("Longueur : " + langages.length);
        System.out.print("Éléments : ");
        for (int i = 0; i < langages.length; i++) {
            System.out.print(langages[i] + " ");
        }
        System.out.println();
        
        double[] decimaux = {3.14, 2.71, 1.41};
        
        System.out.println("Tableau de décimaux :");
        System.out.println("Longueur : " + decimaux.length);
        System.out.print("Éléments : ");
        for (int i = 0; i < decimaux.length; i++) {
            System.out.print(decimaux[i] + " ");
        }
        System.out.println();
    }
}
