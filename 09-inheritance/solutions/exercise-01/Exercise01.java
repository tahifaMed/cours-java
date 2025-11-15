public class Exercise01 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal générique", 5);
        Chien chien = new Chien("Rex", 3, "Labrador");
        
        chien.faireDuBruit();
        chien.manger();
        chien.aboyer();
    }
}
