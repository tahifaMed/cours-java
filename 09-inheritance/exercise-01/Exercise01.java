import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {



        // TODO : Créer un Animal générique
        // TODO : Animal animal = new Animal("Animal générique", 5);
        Animal1 animale = new Animal1("Animal");
        
        // TODO : Créer un Chien
        // TODO : Chien chien = new Chien("Rex", 3, "Labrador");
        Animal1 chien = new Chien1("ricci","Pomeranien");

        System.out.println(chien.getNom());
        
        // TODO : Appeler faireDuBruit() sur le chien
        // TODO : La méthode redéfinie doit être appelée
        
        // TODO : Appeler manger() sur le chien
        // TODO : Cette méthode est héritée
        
        // TODO : Appeler aboyer() sur le chien
        // TODO : Cette méthode est spécifique au Chien
        
    }
}
