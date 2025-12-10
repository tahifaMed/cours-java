// TODO : Implémenter Calculatrice
public class Addition implements Calculatrice {
    @Override
    public int calculer(int a, int b) {
        return a+b;
    }

    @Override
    public void afficherResultat(int resultat){
        System.out.println("Addition : "+resultat);
    }

    // TODO : Implémenter calculer(int a, int b)
    // TODO : Retourner a + b
    // TODO : Appeler afficherResultat() avec le résultat
    
}
