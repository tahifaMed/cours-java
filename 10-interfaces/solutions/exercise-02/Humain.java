public class Humain implements Nageur, Coureur {
    @Override
    public void nager() {
        System.out.println("L'humain nage");
    }
    
    @Override
    public void courir() {
        System.out.println("L'humain court");
    }
}
