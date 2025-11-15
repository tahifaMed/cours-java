public class Exercise02 {
    public static void main(String[] args) {
        Canard canard = new Canard();
        canard.voler();
        canard.nager();
        
        Humain humain = new Humain();
        humain.nager();
        humain.courir();
    }
}
