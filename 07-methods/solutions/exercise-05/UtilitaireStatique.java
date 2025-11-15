public class UtilitaireStatique {
    public static int maximum(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static double calculerAireCercle(double rayon) {
        return Math.PI * rayon * rayon;
    }
    
    public void methodeInstance() {
        System.out.println("Méthode d'instance appelée");
    }
}
