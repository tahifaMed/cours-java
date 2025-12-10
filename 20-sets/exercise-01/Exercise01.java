import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise01 {
    public static void main(String[] args) {
        // TODO : Créer un HashSet de String
        Set<String> set = new LinkedHashSet<String>();
        
        // TODO : Ajouter des éléments
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");
        set.add("Java");  // Doublon - sera ignoré
        
        // TODO : Afficher la taille
        System.out.println("Taille après ajouts : " + set.size());

        for (String element : set) {
             System.out.println(element);
         }

        // TODO : Vérifier si un élément existe
        System.out.println("Le set contient 'Java' : " + set.contains("Java"));
        
        // TODO : Tenter d'ajouter un élément existant (retourne false)
        // TODO : boolean ajoutReussi = set.add("Java");
        // TODO : System.out.println("Tentative d'ajout de 'Java' (déjà présent) : " + ajoutReussi);
        // TODO : System.out.println("Taille finale : " + set.size());
        
        // TODO : Parcourir le set
        // TODO : System.out.println("Éléments du set :");
        // TODO : for (String element : set) {
        // TODO :     System.out.println(element);
        // TODO : }
        
        // TODO : Supprimer un élément
        set.remove("Python");


        System.out.println("Taille après suppression : " + set.size());
        
    }
}

