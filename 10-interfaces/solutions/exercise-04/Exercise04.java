public class Exercise04 {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(3.0);
        
        double aire = cercle.calculerAire();
        System.out.println("Aire du cercle : " + aire);
        
        cercle.afficherMaxSize();
    }
}
