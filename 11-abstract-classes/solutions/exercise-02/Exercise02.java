public class Exercise02 {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("Rouge", 5.0);
        System.out.println("Cercle - Aire : " + cercle.calculerAire() + ", Périmètre : " + cercle.calculerPerimetre());
        
        Rectangle rectangle = new Rectangle("Bleu", 4.0, 5.0);
        System.out.println("Rectangle - Aire : " + rectangle.calculerAire() + ", Périmètre : " + rectangle.calculerPerimetre());
    }
}
