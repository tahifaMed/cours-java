public class Exercise04 {
    public static void main(String[] args) {
        int[][] matrice = new int[3][4];
        
        // Remplir le tableau
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = i * 4 + j + 1;
            }
        }
        
        System.out.println("Matrice 3x4 :");
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Élément à [1][2] : " + matrice[1][2]);
        
        int[][] matriceInit = {{1, 2, 3}, {4, 5, 6}};
        
        System.out.println("Matrice initialisée :");
        for (int i = 0; i < matriceInit.length; i++) {
            for (int j = 0; j < matriceInit[i].length; j++) {
                System.out.print(matriceInit[i][j] + " ");
            }
            System.out.println();
        }
    }
}
