import java.util.*;
import java.util.stream.Collectors;

public class Exercise01 {
    public static void main(String[] args) {
        // TODO : Créer une liste de nombres
        // TODO : List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // TODO : Filtrer les pairs et multiplier par 2
        // TODO : List<Integer> pairsDoubles = nombres.stream()
        // TODO :     .filter(n -> n % 2 == 0)
        // TODO :     .map(n -> n * 2)
        // TODO :     .collect(Collectors.toList());
        // TODO : System.out.println("Nombres pairs multipliés par 2 : " + pairsDoubles);
        
        // TODO : Filtrer > 5 et convertir en String
        // TODO : List<String> grandsNombres = nombres.stream()
        // TODO :     .filter(n -> n > 5)
        // TODO :     .map(n -> String.valueOf(n))
        // TODO :     .collect(Collectors.toList());
        // TODO : System.out.println("Nombres > 5 en String : " + grandsNombres);
        
        // TODO : Utiliser distinct() pour éliminer les doublons
        // TODO : List<Integer> avecDoublons = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5);
        // TODO : List<Integer> distincts = avecDoublons.stream()
        // TODO :     .distinct()
        // TODO :     .collect(Collectors.toList());
        // TODO : System.out.println("Nombres distincts : " + distincts);


        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);



        int somme = nombres.stream()
                .filter(s -> s>=2)
                .map(s ->+ s*2)
                .reduce(0, (a, b) -> a + b);
        System.out.println(somme);

        List<List<Integer>> listes = Arrays.asList(
                Arrays.asList(4, 5,5,6),
                Arrays.asList(1, 2, 3,4),
                Arrays.asList(6, 7, 8, 9)
        );

        Comparator<Integer> integerComparator = (a, b) -> a.compareTo(b) > 0 ? -1 : 1;

        System.out.println(listes.stream()
                .flatMap(List::stream).filter(s -> !s.equals(5)).noneMatch(x -> x.equals(5)));


        List<String> mots = Arrays.asList("Java", "Python", "C++");
        String joinMots = mots.stream().map(String::toUpperCase).reduce("Cours : ", (a, b) -> a + "," + b);
        String joinMotsWithoutDelimiter = mots.stream().map(String::toUpperCase).collect(Collectors.joining());
        String joinMotsWithDelimiter = mots.stream().map(String::toUpperCase).collect(Collectors.joining(", ", "Cours : ",""));
        System.out.println(joinMots);
        System.out.println(joinMotsWithoutDelimiter);
        System.out.println(joinMotsWithDelimiter);

        List<Integer> nombres2 = Arrays.asList(6,1, 2, 3, 4, 5,  7, 8, 9, 10);

        // Trouver le premier nombre pair
        Optional<Integer> premierPair = nombres2.parallelStream()
                .filter(n -> n >5)
                .findAny();

        System.out.println(premierPair.orElse(null));


        List<String> motGrouping = Arrays.asList("Java", "Python", "R", "Rust", "JavaScript");
        Map<Character, List<String>> parLongueur = motGrouping.stream()
                .collect(Collectors.groupingBy(s-> s.charAt(s.length()-1)));
        System.out.println(parLongueur);

        List<String> motPartitioning = Arrays.asList("Java", "Python", "R", "Rust", "JavaScript");
        Map<Boolean, List<String>> parPartition = motPartitioning.stream()
                .collect(Collectors.partitioningBy(s-> s.contains("y")));
        System.out.println(parPartition);
    }
}

