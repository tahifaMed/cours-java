public class Animal1 {
    private String nom;

    private int age;

    public Animal1() {}

    public Animal1(String nom) {
        this.nom = nom;
    }
    public Animal1(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // TODO : Créer une méthode publique void faireDuBruit()
    // TODO : Afficher "L'animal fait du bruit"
    
    // TODO : Créer une méthode publique void manger()
    // TODO : Afficher "[nom] mange"
    
}
