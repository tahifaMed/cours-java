public class Exercise03 {
    public static void main(String[] args) {
        // TODO : Créer une instance d'Addition
        Addition addition = new Addition();
        int count = addition.calculer(1, 4);
        System.out.println(count);
        // TODO : Appeler calculer(5, 3)
        // TODO : La méthode afficherResultat() sera appelée automatiquement
        addition.afficherResultat(count);
    }
}
