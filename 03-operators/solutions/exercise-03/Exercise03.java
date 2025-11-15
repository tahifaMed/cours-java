public class Exercise03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        boolean egal = (a == a);
        System.out.println(a + " == " + a + " : " + egal);
        
        boolean different = (a != b);
        System.out.println(a + " != " + b + " : " + different);
        
        boolean inferieur = (b < a);
        System.out.println(b + " < " + a + " : " + inferieur);
        
        boolean superieur = (a > b);
        System.out.println(a + " > " + b + " : " + superieur);
        
        boolean inferieurEgal = (b <= b);
        System.out.println(b + " <= " + b + " : " + inferieurEgal);
        
        boolean superieurEgal = (a >= a);
        System.out.println(a + " >= " + a + " : " + superieurEgal);
    }
}
