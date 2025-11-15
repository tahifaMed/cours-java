package cours.java.designpatterns.factory;

public class Exercise01 {
    public static void main(String[] args) {
        VehiculeFactory factory = new VehiculeFactory();
        
        // Créer différents types de véhicules
        Vehicule voiture = factory.creer("voiture");
        System.out.println("Voiture créée: " + voiture);
        voiture.demarrer();
        voiture.arreter();
        System.out.println();
        
        Vehicule moto = factory.creer("moto");
        System.out.println("Moto créée: " + moto);
        moto.demarrer();
        moto.arreter();
        System.out.println();
        
        Vehicule camion = factory.creer("camion");
        System.out.println("Camion créé: " + camion);
        camion.demarrer();
        camion.arreter();
        System.out.println();
        
        // Tester un type inconnu
        try {
            factory.creer("avion");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

// TODO: Créer l'interface Vehicule
// 1. Définir l'interface avec demarrer() et arreter()

// TODO: Implémenter les classes concrètes
// 2. Créer Voiture, Moto, et Camion implémentant Vehicule
// 3. Chaque classe doit implémenter demarrer() et arreter()

// TODO: Créer la Simple Factory
// 4. Créer VehiculeFactory avec une méthode statique creer(String type)
// 5. La méthode doit retourner le bon véhicule selon le type
// 6. Lancer IllegalArgumentException pour les types inconnus

