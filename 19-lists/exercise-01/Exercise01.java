import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        // TODO : Créer une ArrayList de String
        // TODO : List<String> liste = new ArrayList<>();
        
        // TODO : Ajouter des éléments
        liste.add("Alice");
        liste.addFirst("kili");
        liste.add(2,"towe");
        liste.add("Bob");
        liste.add("Charlie");
        liste.add("Diana");
        
        // TODO : Afficher la taille
        System.out.println("Taille de la liste : " + liste.size());
        
        // TODO : Accéder à un élément par index
        System.out.println("Élément à l'index 0 : " + liste.get(0));
        
        // TODO : Vérifier si un élément existe
        System.out.println("La liste contient 'Charlie' : " + liste.contains("Charlie"));
        
        // TODO : Parcourir la liste
        System.out.println("Parcours de la liste :");
        for (String nom : liste) {
        System.out.println(nom);
        }
        
        // TODO : Supprimer un élément
        liste.remove("Bob");
        liste.remove(0);

        System.out.println("Taille après suppression : " + liste.size());
        
    }
}

