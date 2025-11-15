public class Exercise05 {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        
        int somme = calc.additionner(5, 3);
        System.out.println("Somme : " + somme);
        
        double produit = calc.multiplier(2.5, 4.0);
        System.out.println("Produit : " + produit);
        
        boolean resultat = calc.estPair(7);
        System.out.println("7 est pair ? " + resultat);
        
        calc.afficherMessage("Bonjour !");
    }
}
