import java.util.Arrays;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        Boite<String> boiteString = new Boite<>("boite de string");
        System.out.println(boiteString.getContent());

        Boite<Integer> boiteInteger = new Boite<>(10);
        System.out.println(boiteInteger.getContent());

        Integer[] ints = {1, 2, 3};
        Util.afficher(ints);

        String[] strings = {"a", "b", "c"};
        Util.afficher(strings);

        System.out.println(Util.max(1,2));
        System.out.println(Util.max("a","A"));

        EtreVivant personne = new Personne(10, "Ahmed");
        EtreVivant personne2 = new Personne(20, "Mohammed");

        //System.out.println(Util.max(personne2, personne));

        List<String> listString = List.of("a", "b");
        Util.afficherListSize(listString);
        Util.afficherList(List.of(personne, personne2));
    }
}

