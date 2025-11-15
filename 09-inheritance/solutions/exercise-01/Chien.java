public class Chien extends Animal {
    String race;
    
    public Chien(String nom, int age, String race) {
        super(nom, age);
        this.race = race;
    }
    
    @Override
    public void faireDuBruit() {
        System.out.println(nom + " aboie : Woof !");
    }
    
    public void aboyer() {
        System.out.println("Woof ! Woof !");
    }
}
