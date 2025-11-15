public class Exercise02 {
    public static void main(String[] args) {
        double nombreDecimal = 3.14;
        System.out.println("Double : " + nombreDecimal);
        
        int nombreEntier = (int) nombreDecimal;
        System.out.println("Double vers Int : " + nombreEntier);
        
        int nombre = 100;
        System.out.println("Int : " + nombre);
        
        long nombreLong = nombre;
        System.out.println("Int vers Long : " + nombreLong);
        
        char lettre = 'A';
        System.out.println("Char : " + lettre);
        
        int codeAscii = lettre;
        System.out.println("Code ASCII de A : " + codeAscii);
        
        int code = 65;
        char caractere = (char) code;
        System.out.println("Int 65 vers Char : " + caractere);
    }
}
