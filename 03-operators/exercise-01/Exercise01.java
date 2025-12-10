import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 3;
        
        // TODO : Calculer et afficher la somme de a et b
        // Format : "10 + 5 = 15"
        
        // TODO : Calculer et afficher la différence de a et b
        // Format : "10 - 5 = 5"
        
        // TODO : Calculer et afficher le produit de a et b
        // Format : "10 * 5 = 50"
        
        // TODO : Calculer et afficher la division entière de a par c
        // Format : "10 / 3 = 3" (division entière)
        
        // TODO : Calculer et afficher la division décimale de a par c
        // Utilisez (double)a / c pour forcer la division décimale
        // Format : "10.0 / 3.0 = 3.3333333333333335"
        
        // TODO : Calculer et afficher le modulo (reste de la division) de a par c
        // Format : "10 % 3 = 1"

        int age = 10;
        String ternaire = "";
        if(age>=10){
            ternaire = "supérieur";
        }
        else {
            ternaire = "inférieur";
        }
         ternaire = age >= 10 ? "supérieur":
                 age == 9 ? "majeur": "mineur";
        System.out.println("age = "+ ternaire);
    }
}
