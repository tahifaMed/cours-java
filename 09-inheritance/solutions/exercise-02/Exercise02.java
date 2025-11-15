public class Exercise02 {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("Rouge", 5.0);
        
        cercle.dessiner();
        
        double aire = cercle.calculerAire();
        System.out.println("Aire du cercle : " + aire);
    }
}
