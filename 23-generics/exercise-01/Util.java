import java.util.Arrays;
import java.util.List;

public class Util {


    public static <T> void afficher(T[] tableau){
        for(int i = 0; i < tableau.length; i++){
            System.out.println("tableau[" +i+ "] => " + tableau[i] );
        }
    }

    public static <T extends Comparable<T>> T max(T a, T b){
        return a.compareTo(b)> 0  ? a : b;
    }

    public static void afficherListSize(List<?> list){
        System.out.println("list size " + list.get(0));
    }

    public static void afficherList(List<? super Personne> list){
        for (Object personne: list) {
            System.out.println(personne);
        }
    }
}
