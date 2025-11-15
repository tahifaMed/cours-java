public interface Calculatrice {
    int calculer(int a, int b);
    
    default void afficherResultat(int resultat) {
        System.out.println("Résultat : " + resultat);
    }
}
