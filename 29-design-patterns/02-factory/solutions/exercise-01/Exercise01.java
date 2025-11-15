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

interface Vehicule {
    void demarrer();
    void arreter();
}

class Voiture implements Vehicule {
    @Override
    public void demarrer() {
        System.out.println("La voiture démarre");
    }
    
    @Override
    public void arreter() {
        System.out.println("La voiture s'arrête");
    }
}

class Moto implements Vehicule {
    @Override
    public void demarrer() {
        System.out.println("La moto démarre");
    }
    
    @Override
    public void arreter() {
        System.out.println("La moto s'arrête");
    }
}

class Camion implements Vehicule {
    @Override
    public void demarrer() {
        System.out.println("Le camion démarre");
    }
    
    @Override
    public void arreter() {
        System.out.println("Le camion s'arrête");
    }
}

class VehiculeFactory {
    public static Vehicule creer(String type) {
        return switch (type.toLowerCase()) {
            case "voiture" -> new Voiture();
            case "moto" -> new Moto();
            case "camion" -> new Camion();
            default -> throw new IllegalArgumentException("Type de véhicule inconnu: " + type);
        };
    }
}
