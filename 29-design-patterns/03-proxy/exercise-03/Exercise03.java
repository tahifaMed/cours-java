package cours.java.designpatterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class Exercise03 {
    public static void main(String[] args) {
        // Créer le calculateur avec proxy
//        Calculateur calculateur = new CalculateurProxy();
//
//        // Premier calcul (résultat calculé)
//        System.out.println("Calcul de fibonacci(10)...");
//        long result1 = calculateur.fibonacci(10);
//        System.out.println("Résultat: " + result1);
//        System.out.println();
//
//        // Même calcul (résultat depuis le cache)
//        System.out.println("Calcul de fibonacci(10)...");
//        long result2 = calculateur.fibonacci(10);
//        System.out.println("Résultat: " + result2);
//        System.out.println();
//
//        // Nouveau calcul
//        System.out.println("Calcul de fibonacci(15)...");
//        long result3 = calculateur.fibonacci(15);
//        System.out.println("Résultat: " + result3);
//        System.out.println();
//
//        // Calcul déjà fait (depuis le cache)
//        System.out.println("Calcul de fibonacci(10)...");
//        long result4 = calculateur.fibonacci(10);
//        System.out.println("Résultat: " + result4);
    }
}

// TODO: Créer l'interface Calculateur
// 1. Méthode: long fibonacci(int n)

// TODO: Créer FibonacciReel
// 1. Implémente Calculateur
// 2. Implémenter fibonacci récursif basique
// 3. Afficher "Calcul de fibonacci([n])..."

// TODO: Créer CalculateurProxy
// 1. Implémente Calculateur
// 2. Utilise Map<Integer, Long> pour le cache
// 3. Si dans cache: retourner valeur
// 4. Sinon: calculer, stocker, retourner
