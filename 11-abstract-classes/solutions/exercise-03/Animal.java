public abstract class Animal {
    protected String nom;
    protected int age;
    
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    public void afficherInfo() {
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
        faireDuBruit();  // Appelle la méthode abstraite (implémentée dans les sous-classes)
    }
    
    public abstract void faireDuBruit();
}
