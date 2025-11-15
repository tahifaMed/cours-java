public class Exercise01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 3;
        
        int somme = a + b;
        System.out.println(a + " + " + b + " = " + somme);
        
        int difference = a - b;
        System.out.println(a + " - " + b + " = " + difference);
        
        int produit = a * b;
        System.out.println(a + " * " + b + " = " + produit);
        
        int divisionEntiere = a / c;
        System.out.println(a + " / " + c + " = " + divisionEntiere);
        
        double divisionDecimale = (double) a / c;
        System.out.println((double) a + " / " + (double) c + " = " + divisionDecimale);
        
        int reste = a % c;
        System.out.println(a + " % " + c + " = " + reste);
    }
}
