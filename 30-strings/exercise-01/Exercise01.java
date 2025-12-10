public class Exercise01 {
    public static void main(String[] args) {
        // TODO : Créez une String avec votre prénom
        // Exemple : String prenom = "Jean";
        
        // TODO : Créez une String avec votre nom
        // Exemple : String nom = "Dupont";
        
        // TODO : Affichez la longueur du prénom
        // Format : "Longueur du prénom : X"
        
        // TODO : Affichez la longueur du nom
        // Format : "Longueur du nom : X"
        
        // TODO : Affichez le premier caractère du prénom
        // Format : "Premier caractère du prénom : X"
        
        // TODO : Affichez le premier caractère du nom
        // Format : "Premier caractère du nom : X"
        
        // TODO : Concaténez le prénom et le nom avec un espace entre les deux
        // Format : "Jean Dupont"
        
        // TODO : Affichez la String complète
        // Format : "Nom complet : Jean Dupont"
        
        // TODO : Affichez la longueur de la String complète
        // Format : "Longueur du nom complet : X"

        String s1 = "Hello";
        String s2 = "HELLO";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        s1 = s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s1 == s2);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append("World").toString().toLowerCase();
        System.out.println(sb.toString());
    }
}

