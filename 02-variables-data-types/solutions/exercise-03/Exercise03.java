public class Exercise03 {
    public static void main(String[] args) {
        String prenom = "Jean";
        String nom = "Dupont";
        
        String nomComplet = prenom + " " + nom;
        System.out.println("Nom complet : " + nomComplet);
        
        int longueur = nomComplet.length();
        System.out.println("Longueur : " + longueur);
        
        String majuscules = nomComplet.toUpperCase();
        System.out.println("En majuscules : " + majuscules);
        
        String minuscules = nomComplet.toLowerCase();
        System.out.println("En minuscules : " + minuscules);
        
        String sousChaine = nomComplet.substring(0, 4);
        System.out.println("Sous-chaîne (0-4) : " + sousChaine);
        
        char caractere = nomComplet.charAt(5);
        System.out.println("Caractère à l'index 5 : " + caractere);
    }
}
