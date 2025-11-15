public class Exercise05 {
    public static void main(String[] args) {
        int max = UtilitaireStatique.maximum(5, 10);
        System.out.println("Maximum : " + max);
        
        double aire = UtilitaireStatique.calculerAireCercle(3.0);
        System.out.println("Aire du cercle : " + aire);
        
        UtilitaireStatique util = new UtilitaireStatique();
        util.methodeInstance();
    }
}
