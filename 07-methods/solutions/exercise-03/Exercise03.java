public class Exercise03 {
    public static void main(String[] args) {
        UtilisateurVarargs util = new UtilisateurVarargs();
        
        int resultat1 = util.somme(1, 2, 3);
        System.out.println("Somme : " + resultat1);
        
        int resultat2 = util.somme(10, 20, 30, 40);
        System.out.println("Somme : " + resultat2);
        
        util.afficherMessages("Un", "Deux", "Trois");
    }
}
