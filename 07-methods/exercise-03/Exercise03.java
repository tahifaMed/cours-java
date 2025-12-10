import java.util.Arrays;

public class Exercise03 {
    public static void main(String[] args) {
        UtilisateurVarargs util = new UtilisateurVarargs();

        int somme = util.somme(1, 2, 3, 4, 5);
        System.out.println(somme);

        util.afficherMessage(5,6,7,8,9,10,11,12);

        // TODO : Appeler somme avec 3 arguments : 1, 2, 3
        // TODO : Afficher "Somme : 6"
        
        // TODO : Appeler somme avec 4 arguments : 10, 20, 30, 40
        // TODO : Afficher "Somme : 100"
        
        // TODO : Appeler afficherMessages avec 3 messages : "Un", "Deux", "Trois"
        
    }
}
