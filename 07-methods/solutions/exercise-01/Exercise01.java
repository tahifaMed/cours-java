public class Exercise01 {
    public static void main(String[] args) {
        Utilitaires util = new Utilitaires();
        
        util.saluer();
        util.saluerPersonne("Alice");
        
        int carre = util.calculerCarre(5);
        System.out.println("5 au carré = " + carre);
        
        double moyenne = util.calculerMoyenne(10.5, 20.3);
        System.out.println("Moyenne de 10.5 et 20.3 = " + moyenne);
    }
}
