public class Exercise04 {
    public static void main(String[] args) {
        String texte = "  Bonjour le monde  ";
        
        System.out.println("Original : '" + texte + "'");
        
        String trimme = texte.trim();
        System.out.println("Après trim() : '" + trimme + "'");
        
        String majuscules = trimme.toUpperCase();
        System.out.println("En majuscules : " + majuscules);
        
        String minuscules = trimme.toLowerCase();
        System.out.println("En minuscules : " + minuscules);
        
        String phrase = "Java est un langage de programmation";
        
        String remplaceA = phrase.replace('a', 'A');
        System.out.println("Après replace('a', 'A') : " + remplaceA);
        
        String remplaceLangage = phrase.replace("langage", "language");
        System.out.println("Après replace('langage', 'language') : " + remplaceLangage);
        
        String remplaceJava = phrase.replace("Java", "Python");
        System.out.println("Après replace('Java', 'Python') : " + remplaceJava);
        
        String avecEspaces = "  Hello   World  ";
        String resultatFinal = avecEspaces.trim().replace("World", "Java");
        System.out.println("Résultat final : " + resultatFinal);
    }
}

