public class Exercise04 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final int TAILLE_MAX = 100;
        final String NOM_APPLICATION = "Mon Application";
        
        System.out.println("Nom de l'application : " + NOM_APPLICATION);
        System.out.println("Valeur de PI : " + PI);
        System.out.println("Taille maximale : " + TAILLE_MAX);
        
        int rayon = 5;
        double aire = PI * rayon * rayon;
        System.out.println("Aire d'un cercle de rayon 5 : " + aire);
        
        // PI = 3.14;  // Cette ligne provoquerait une erreur de compilation
        // erreur: cannot assign a value to final variable PI
    }
}
