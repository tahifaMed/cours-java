public class Addition implements Calculatrice {
    @Override
    public int calculer(int a, int b) {
        int resultat = a + b;
        afficherResultat(resultat);
        return resultat;
    }
}
