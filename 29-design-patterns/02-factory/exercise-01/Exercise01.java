package cours.java.designpatterns.factory;

import java.util.ArrayList;

public class Exercise01 {
    public static void main(String[] args) {

        // Créer différents types de véhicules
        Vehicule voiture = VehiculeFactory.creer("voiture");
        System.out.println("Voiture créée: " + voiture);
        voiture.demarrer();
        voiture.arreter();
        System.out.println();
        
//        Vehicule moto = factory.creer("moto");
//        System.out.println("Moto créée: " + moto);
//        moto.demarrer();
//        moto.arreter();
//        System.out.println();
//
//        Vehicule camion = factory.creer("camion");
//        System.out.println("Camion créé: " + camion);
//        camion.demarrer();
//        camion.arreter();
//        System.out.println();
        
        // Tester un type inconnu
        try {
            VehiculeFactory.creer("avion");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

// TODO: Créer l'interface Vehicule
// 1. Définir l'interface avec demarrer() et arreter()

interface Vehicule {
    public void demarrer();
    public void arreter();
}

// TODO: Implémenter les classes concrètes
// 2. Créer Voiture, Moto, et Camion implémentant Vehicule
// 3. Chaque classe doit implémenter demarrer() et arreter()

class Voiture implements Vehicule {

    private String nom;

    public Voiture(String nom){
        this.nom = nom;
    }
    public void demarrer() {
        System.out.println("Voiture demarrer");
    }
    public void arreter() {
        System.out.println("Voiture arreter");
    }
}


class Moto implements Vehicule {
    public void demarrer() {
        System.out.println("Moto demarrer");
    }

    public void arreter() {
        System.out.println("Moto arreter");
    }
}


// TODO: Créer la Simple Factory
// 4. Créer VehiculeFactory avec une méthode statique creer(String type)
// 5. La méthode doit retourner le bon véhicule selon le type
// 6. Lancer IllegalArgumentException pour les types inconnus

class VehiculeFactory {

    public static Vehicule creer(String type) {
        switch (type) {
            case "voiture":
                return new Voiture("voiture");
            case "moto":
                return new Moto();
        }
        throw new IllegalArgumentException("pas d'object de ce type");
    }
}

