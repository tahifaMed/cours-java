import java.util.Arrays;

public class Exercise02 {
    public static void main(String[] args) {
        // TODO : Créer une voiture v1 en utilisant le constructeur par défaut
        // TODO : Utiliser : Voiture v1 = new Voiture();
        
        // TODO : Afficher "Voiture 1 : " puis appeler afficherInfo() sur v1
        
        // TODO : Créer une voiture v2 en utilisant le constructeur avec paramètres
        // TODO : Utiliser : Voiture v2 = new Voiture("Toyota", "Corolla", 2023);
        
        // TODO : Afficher "Voiture 2 : " puis appeler afficherInfo() sur v2

        Voiture voiture = new Voiture();
        voiture.setName("Mazda");
        voiture.setNombreDeSiege(5);
        System.out.println(voiture.getVoitureName());

        Voiture voiture2 = new Voiture("Fiat",3);
        System.out.println(voiture2.getVoitureName("5"));

        int maximum = voiture2.maximum(1, 2);
        System.out.println("maximum = " + maximum);

    }
}


