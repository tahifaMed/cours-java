public class Exercise04 {
    public static void main(String[] args) {
        Compteur c1 = new Compteur();
        c1.incrementer();
        c1.incrementer();
        
        Compteur c2 = new Compteur();
        c2.incrementer();
        
        Compteur c3 = new Compteur();
        
        System.out.println("c1.valeur : " + c1.valeur);
        System.out.println("c2.valeur : " + c2.valeur);
        System.out.println("Instances créées : " + Compteur.getNombreInstances());
    }
}
