public class Exercise06 {
    public static void main(String[] args) {
        int age = 20;
        String statut = (age >= 18) ? "Majeur" : "Mineur";
        System.out.println("Âge : " + age);
        System.out.println("Statut : " + statut);
        
        int nombre1 = 15;
        int nombre2 = 25;
        int maximum = (nombre1 > nombre2) ? nombre1 : nombre2;
        System.out.println("Nombre 1 : " + nombre1);
        System.out.println("Nombre 2 : " + nombre2);
        System.out.println("Maximum : " + maximum);
        
        int nombre = 8;
        String parite = (nombre % 2 == 0) ? "Pair" : "Impair";
        System.out.println("Nombre : " + nombre);
        System.out.println("Parité : " + parite);
    }
}
