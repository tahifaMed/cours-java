public class Avion implements Volant {
    @Override
    public void voler() {
        System.out.println("L'avion vole dans le ciel");
    }
    
    @Override
    public void atterrir() {
        System.out.println("L'avion atterrit sur la piste");
    }
}
