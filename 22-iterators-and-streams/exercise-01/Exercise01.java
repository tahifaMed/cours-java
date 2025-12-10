import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise01 {
    public static void main(String[] args) {
        // TODO : Créer une ArrayList
        List<String> liste = new ArrayList<>();
        liste.add("A");
        liste.add("B");
        liste.add("C");
        liste.add("D");

        Set<String> set = liste.stream()
                .filter(s ->  !s.equals("A"))
                .map(s -> s.toLowerCase())
                .collect(Collectors.toSet());

        System.out.println(set);

//        for(String s : liste){
//            if(s.equals("A")){
//                liste.remove(s);
//            }
//        }
        
        // TODO : Obtenir un Iterator
        Iterator<String> it = liste.iterator();
        
        // TODO : Parcourir avec Iterator
        while (it.hasNext()) {
        String element = it.next();
        System.out.println("Élément : " + element);
        // TODO :     
        // TODO :     // Supprimer "B" pendant le parcours
             if (element.equals("B")) {
                 it.remove();
             }
         }
        
        // TODO : Afficher les éléments restants
        System.out.println("Éléments restants : " + liste);
        
    }
}

