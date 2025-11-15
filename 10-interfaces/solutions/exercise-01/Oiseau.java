public class Oiseau implements Volant {
    @Override
    public void voler() {
        System.out.println("L'oiseau vole en battant des ailes");
    }
    
    @Override
    public void atterrir() {
        System.out.println("L'oiseau atterrit sur une branche");
    }
}
