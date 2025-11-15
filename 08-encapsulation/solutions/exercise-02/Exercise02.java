public class Exercise02 {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("Jean", 20);
        
        System.out.println("Nom : " + etudiant.getNom());
        System.out.println("Âge : " + etudiant.getAge());
        
        System.out.println("Tentative d'âge invalide : 150");
        etudiant.setAge(150);
        System.out.println("Âge reste : " + etudiant.getAge());
        
        etudiant.ajouterNote(15.0);
        System.out.println("Moyenne : " + etudiant.getMoyenne());
    }
}
