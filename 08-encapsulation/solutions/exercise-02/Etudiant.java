public class Etudiant {
    private String nom;
    private int age;
    private double moyenne;
    
    public Etudiant(String nom, int age) {
        this.nom = nom;
        setAge(age);
        this.moyenne = 0.0;
    }
    
    public String getNom() {
        return nom;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getMoyenne() {
        return moyenne;
    }
    
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Âge invalide");
        }
    }
    
    public void setNom(String nom) {
        if (nom != null && !nom.trim().isEmpty()) {
            this.nom = nom;
        }
    }
    
    public void ajouterNote(double note) {
        if (note >= 0 && note <= 20) {
            moyenne = (moyenne + note) / 2;
        }
    }
}
