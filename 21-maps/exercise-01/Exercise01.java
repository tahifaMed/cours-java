import java.util.HashMap;
import java.util.Map;

public class Exercise01 {
    public static void main(String[] args) {
        // TODO : Créer un HashMap pour stocker des noms et âges
        Map<String, Lieu> ages = new HashMap<>();
        
        // TODO : Ajouter des paires clé-valeur
        ages.put("Fes", new Lieu("Fes",3000,2000000L));
        ages.put("Rabat", new Lieu("Rabat",4000,3000000L));
        ages.put("Casa", new Lieu("Casa",2000,10000000L));

        System.out.println(ages.get("Fes"));
        // TODO : Afficher la taille
        System.out.println("Taille de la map : " + ages.size());
        
        // TODO : Récupérer une valeur
        // TODO : System.out.println("Âge d'Alice : " + ages.get("Alice"));
        
        // TODO : Vérifier si une clé existe
        // TODO : System.out.println("La map contient la clé 'Bob' : " + ages.containsKey("Bob"));
        
        // TODO : Vérifier si une valeur existe
        // TODO : System.out.println("La map contient la valeur 28 : " + ages.containsValue(28));
        
        // TODO : Parcourir la map
        // TODO : System.out.println("Parcours de la map :");
        // TODO : for (Map.Entry<String, Integer> entry : ages.entrySet()) {
        // TODO :     System.out.println(entry.getKey() + " : " + entry.getValue());
        // TODO : }
        
        // TODO : Supprimer une entrée
        // TODO : ages.remove("Charlie");
        // TODO : System.out.println("Taille après suppression : " + ages.size());
        
    }
}

