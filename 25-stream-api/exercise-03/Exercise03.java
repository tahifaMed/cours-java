public class Exercise03 {
    public static void main(String[] args) {
        // TODO : Classe Personne
        // TODO : static class Personne {
        // TODO :     String nom;
        // TODO :     int age;
        // TODO :     
        // TODO :     Personne(String nom, int age) {
        // TODO :         this.nom = nom;
        // TODO :         this.age = age;
        // TODO :     }
        // TODO : }
        
        // TODO : Créer une liste de personnes
        // TODO : List<Personne> personnes = Arrays.asList(
        // TODO :     new Personne("Alice", 25),
        // TODO :     new Personne("Bob", 30),
        // TODO :     new Personne("Charlie", 28),
        // TODO :     new Personne("Diana", 30)
        // TODO : );
        
        // TODO : Grouper par âge avec groupingBy
        // TODO : Map<Integer, List<Personne>> parAge = personnes.stream()
        // TODO :     .collect(Collectors.groupingBy(p -> p.age));
        // TODO : System.out.println("Groupement par âge : " + parAge);
        
        // TODO : Partitionner majeurs/mineurs avec partitioningBy (>= 30)
        // TODO : Map<Boolean, List<Personne>> parMajorite = personnes.stream()
        // TODO :     .collect(Collectors.partitioningBy(p -> p.age >= 30));
        // TODO : System.out.println("Partition >= 30 : " + parMajorite);
        
        // TODO : Joindre les noms avec joining
        // TODO : String noms = personnes.stream()
        // TODO :     .map(p -> p.nom)
        // TODO :     .collect(Collectors.joining("-"));
        // TODO : System.out.println("Noms joints : " + noms);
        
        // TODO : Créer une map avec toMap
        // TODO : Map<String, Integer> mapNomAge = personnes.stream()
        // TODO :     .collect(Collectors.toMap(p -> p.nom, p -> p.age));
        // TODO : System.out.println("Map nom-âge : " + mapNomAge);
        
    }
}

