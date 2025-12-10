import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {

        CompteBancaire compte1 = new CompteBancaire();
        compte1.setSolde(1234L);
        compte1.setTitulaire("XXXX");

        System.out.println(compte1.getSolde() +" "+compte1.getTitulaire());


        // TODO : Créer un compte avec titulaire "Alice" et solde initial 1000.0
        
        // TODO : Utiliser getTitulaire() pour afficher le titulaire
        // TODO : Afficher "Titulaire : Alice"
        
        // TODO : Utiliser getSolde() pour afficher le solde
        // TODO : Afficher "Solde : 1000.0"
        
        // TODO : Essayer d'accéder directement à compte.solde (commenté car erreur)
        // TODO : Cette ligne devrait provoquer une erreur de compilation
        
    }
}
