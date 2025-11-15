public class Exercise03 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = "java";
        String s5 = "JAVA";
        
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1.equals(s4) : " + s1.equals(s4));
        System.out.println("s1.equalsIgnoreCase(s4) : " + s1.equalsIgnoreCase(s4));
        System.out.println("s1.equalsIgnoreCase(s5) : " + s1.equalsIgnoreCase(s5));
        
        String texte = "Bonjour le monde";
        
        System.out.println("Commence par 'Bonjour' : " + texte.startsWith("Bonjour"));
        System.out.println("Se termine par 'monde' : " + texte.endsWith("monde"));
        System.out.println("Contient 'le' : " + texte.contains("le"));
    }
}

