public class Exercise02 {
    public static void main(String[] args) {
        Voiture v1 = new Voiture();
        System.out.print("Voiture 1 : ");
        v1.afficherInfo();
        
        Voiture v2 = new Voiture("Toyota", "Corolla", 2023);
        System.out.print("Voiture 2 : ");
        v2.afficherInfo();
    }
}
