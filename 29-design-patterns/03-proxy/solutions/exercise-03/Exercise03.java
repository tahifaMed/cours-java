package cours.java.designpatterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class Exercise03 {
    public static void main(String[] args) {
        // Créer le calculateur avec proxy
        Calculateur calculateur = new CalculateurProxy();
        
        // Premier calcul (résultat calculé)
        System.out.println("Calcul de fibonacci(10)...");
        long result1 = calculateur.fibonacci(10);
        System.out.println("Résultat: " + result1);
        System.out.println();
        
        // Même calcul (résultat depuis le cache)
        System.out.println("Calcul de fibonacci(10)...");
        long result2 = calculateur.fibonacci(10);
        System.out.println("Résultat: " + result2);
        System.out.println();
        
        // Nouveau calcul
        System.out.println("Calcul de fibonacci(15)...");
        long result3 = calculateur.fibonacci(15);
        System.out.println("Résultat: " + result3);
        System.out.println();
        
        // Calcul déjà fait (depuis le cache)
        System.out.println("Calcul de fibonacci(10)...");
        long result4 = calculateur.fibonacci(10);
        System.out.println("Résultat: " + result4);
    }
}

interface Calculateur {
    long fibonacci(int n);
}

class FibonacciReel implements Calculateur {
    @Override
    public long fibonacci(int n) {
        System.out.println("Calcul de fibonacci(" + n + ")...");
        return calculate(n);
    }
    
    private long calculate(int n) {
        if (n <= 1) return n;
        return calculate(n - 1) + calculate(n - 2);
    }
}

class CalculateurProxy implements Calculateur {
    private FibonacciReel fibonacciReel;
    private Map<Integer, Long> cache;
    
    public CalculateurProxy() {
        this.fibonacciReel = new FibonacciReel();
        this.cache = new HashMap<>();
    }
    
    @Override
    public long fibonacci(int n) {
        if (cache.containsKey(n)) {
            System.out.println("Depuis le cache: " + n + " = " + cache.get(n));
            return cache.get(n);
        }
        
        long result = fibonacciReel.fibonacci(n);
        cache.put(n, result);
        return result;
    }
}
