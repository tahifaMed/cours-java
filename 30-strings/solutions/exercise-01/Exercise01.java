public class Exercise01 {
    public static void main(String[] args) {
        String prenom = "Jean";
        String nom = "Dupont";
        
        System.out.println("Longueur du prénom : " + prenom.length());
        System.out.println("Longueur du nom : " + nom.length());
        System.out.println("Premier caractère du prénom : " + prenom.charAt(0));
        System.out.println("Premier caractère du nom : " + nom.charAt(0));
        
        String nomComplet = prenom + " " + nom;
        System.out.println("Nom complet : " + nomComplet);
        System.out.println("Longueur du nom complet : " + nomComplet.length());
    }
}

