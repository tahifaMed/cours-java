import java.util.LinkedList;

public class Exercise02 {
    public static void main(String[] args) {
        // TODO : Créer une LinkedList d'entiers
        LinkedList<Integer> liste = new LinkedList<>();
        
        // TODO : Ajouter des éléments avec addFirst et addLast
        liste.addFirst(10);  // Ajoute au début
        liste.add(30);       // Ajoute à la fin
        liste.addLast(50);   // Ajoute à la fin
        liste.add(1, 20);    // Insère à l'index 1
        liste.addLast(40);   // Ajoute à la fin

        // TODO : Afficher la liste
        System.out.println("Liste après ajouts : " + liste);
        
        // TODO : Afficher le premier et dernier élément
        // TODO : System.out.println("Premier élément : " + liste.getFirst());
        // TODO : System.out.println("Dernier élément : " + liste.getLast());
        
        // TODO : Supprimer le premier et dernier élément
        // TODO : liste.removeFirst();
        // TODO : liste.removeLast();
        
        // TODO : Afficher la liste après suppressions
        // TODO : System.out.println("Liste après suppressions : " + liste);
        
    }
}

