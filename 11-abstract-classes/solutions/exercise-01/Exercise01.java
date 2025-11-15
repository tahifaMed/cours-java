public class Exercise01 {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("Rouge", 5.0);
        
        System.out.println("Couleur : " + cercle.couleur);
        
        System.out.println("Aire : " + cercle.calculerAire());
        
        System.out.println("Périmètre : " + cercle.calculerPerimetre());
    }
}
