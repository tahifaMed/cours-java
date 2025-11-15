public class Exercise03 {
    public static void main(String[] args) {
        CompteBancaireAvance compte = new CompteBancaireAvance("Alice", 1000.0);
        
        System.out.println("Solde initial : " + compte.getSolde());
        
        compte.deposer(500.0);
        System.out.println("Après dépôt de 500.0 : " + compte.getSolde());
        
        boolean retraitReussi = compte.retirer(300.0);
        if (retraitReussi) {
            System.out.println("Retrait réussi");
        } else {
            System.out.println("Retrait échoué : Solde insuffisant");
        }
        System.out.println("Solde final : " + compte.getSolde());
        
        boolean retraitEchoue = compte.retirer(2000.0);
        if (!retraitEchoue) {
            System.out.println("Retrait de 2000.0 échoué : Solde insuffisant");
        }
    }
}
