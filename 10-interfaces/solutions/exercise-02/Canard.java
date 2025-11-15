public class Canard implements Volant, Nageur {
    @Override
    public void voler() {
        System.out.println("Le canard vole");
    }
    
    @Override
    public void atterrir() {
        System.out.println("Le canard atterrit");
    }
    
    @Override
    public void nager() {
        System.out.println("Le canard nage");
    }
}
