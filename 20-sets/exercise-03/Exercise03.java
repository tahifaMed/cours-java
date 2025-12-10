import java.util.HashSet;
import java.util.Set;

public class Exercise03 {
    public static void main(String[] args) {
        // TODO : Créer le premier set
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        
        // TODO : Créer le second set
        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);
        
        // TODO : Afficher les sets originaux
        System.out.println("Set A : " + setA);
        System.out.println("Set B : " + setB);
        
        // TODO : Union (A ∪ B) - tous les éléments
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union (A ∪ B) : " + union);
        
        // TODO : Intersection (A ∩ B) - éléments communs
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection (A ∩ B) : " + intersection);
        
        // TODO : Différence (A - B) - éléments de A pas dans B
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Différence (A - B) : " + difference);
        
    }
}

