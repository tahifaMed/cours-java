public class Animal {
    String nom;
    int age;
    
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    public void faireDuBruit() {
        System.out.println("L'animal fait du bruit");
    }
    
    public void manger() {
        System.out.println(nom + " mange");
    }
}
