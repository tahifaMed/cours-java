public class Etudiant {
    private String nom;
    private int age;
    private double moyenne;
    
    public Etudiant(String nom, int age) {
        this.nom = nom;
        setAge(age);  // Utiliser le setter pour la validation
        this.moyenne = 0.0;
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

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    // TODO : Créer un getter public String getNom()
    
    // TODO : Créer un getter public int getAge()
    
    // TODO : Créer un getter public double getMoyenne()
    
    // TODO : Créer un setter public void setAge(int age)
    // TODO : Valider que age >= 0 && age <= 120
    // TODO : Si valide, modifier this.age, sinon afficher "Âge invalide"
    
    // TODO : Créer un setter public void setNom(String nom)
    // TODO : Valider que nom != null && !nom.trim().isEmpty()
    // TODO : Si valide, modifier this.nom
    
    // TODO : Créer une méthode public void ajouterNote(double note)
    // TODO : Valider que note >= 0 && note <= 20
    // TODO : Si valide, mettre à jour la moyenne : moyenne = (moyenne + note) / 2
    
}
