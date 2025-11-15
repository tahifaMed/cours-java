public class Exercise03 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        
        System.out.print("Rectangle créé : ");
        rect.afficherInfo();
        
        double aire = rect.calculerAire();
        System.out.println("Aire du rectangle : " + aire);
        
        rect.redimensionner(8.0, 6.0);
        System.out.print("Nouvelle taille : ");
        rect.afficherInfo();
    }
}
