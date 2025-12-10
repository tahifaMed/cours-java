// TODO : Faire hériter Chien de Animal avec extends Animal
public class Chien1 extends Animal1 {
    private String race;
    private Collier collier;
    
    // TODO : Créer un constructeur Chien(String nom, int age, String race)
    // TODO : Utiliser super(nom, age) pour appeler le constructeur du parent

    public Chien1(String nom,String race) {
        super(nom);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    // TODO : Redéfinir (override) la méthode faireDuBruit()
    // TODO : Utiliser @Override pour indiquer la redéfinition
    // TODO : Afficher "[nom] aboie : Woof !"
    
    // TODO : Créer une méthode publique void aboyer()
    // TODO : Afficher "Woof ! Woof !"
    private class Collier{
        private String type;
    }

}

