public class Personne extends EtreVivant implements Comparable<Personne>{

    private Integer age;
    private String nom;

    public Personne(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    @Override
    public int compareTo(Personne o) {
        return this.age.compareTo(o.age);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "age=" + age +
                ", nom='" + nom + '\'' +
                '}';
    }
}
