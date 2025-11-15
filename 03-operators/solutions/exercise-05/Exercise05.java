public class Exercise05 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("x initial : " + x);
        
        // Post-incrémentation
        int resultatPostIncrement = x++;
        System.out.println("Après x++ : " + x + " (mais x++ retourne " + resultatPostIncrement + ")");
        
        // Pré-incrémentation
        int resultatPreIncrement = ++x;
        System.out.println("Après ++x : " + x + " (et ++x retourne " + resultatPreIncrement + ")");
        
        // Post-décrémentation
        int resultatPostDecrement = x--;
        System.out.println("Après x-- : " + x + " (mais x-- retourne " + resultatPostDecrement + ")");
        
        // Pré-décrémentation
        int resultatPreDecrement = --x;
        System.out.println("Après --x : " + x + " (et --x retourne " + resultatPreDecrement + ")");
    }
}
