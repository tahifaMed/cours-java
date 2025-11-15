public class Exercise01 {
    public static void main(String[] args) {
        int nombre = 10;
        
        if (nombre >= 0) {
            System.out.println("Le nombre " + nombre + " est positif");
        }
        
        int age = 20;
        
        if (age >= 18) {
            System.out.println("Vous êtes majeur");
        } else {
            System.out.println("Vous êtes mineur");
        }
        
        int note = 85;
        
        if (note >= 90) {
            System.out.println("Excellent !");
        } else if (note >= 75) {
            System.out.println("Bien !");
        } else if (note >= 60) {
            System.out.println("Satisfaisant");
        } else {
            System.out.println("À améliorer");
        }
    }
}
