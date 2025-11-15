public class Exercise02 {
    public static void main(String[] args) {
        int jour = 3;
        
        switch (jour) {
            case 1:
                System.out.println("Jour " + jour + " : Lundi");
                break;
            case 2:
                System.out.println("Jour " + jour + " : Mardi");
                break;
            case 3:
                System.out.println("Jour " + jour + " : Mercredi");
                break;
            case 4:
                System.out.println("Jour " + jour + " : Jeudi");
                break;
            case 5:
                System.out.println("Jour " + jour + " : Vendredi");
                break;
            default:
                System.out.println("Jour " + jour + " : Jour invalide");
        }
        
        String saison = "été";
        
        switch (saison) {
            case "printemps":
                System.out.println("Saison " + saison + " : Fleurs et chaleur");
                break;
            case "été":
                System.out.println("Saison " + saison + " : Soleil et plage");
                break;
            case "automne":
                System.out.println("Saison " + saison + " : Feuilles colorées");
                break;
            case "hiver":
                System.out.println("Saison " + saison + " : Neige et froid");
                break;
            default:
                System.out.println("Saison " + saison + " : Saison inconnue");
        }
        
        int jourInvalide = 10;
        switch (jourInvalide) {
            case 1:
                System.out.println("Jour " + jourInvalide + " : Lundi");
                break;
            case 2:
                System.out.println("Jour " + jourInvalide + " : Mardi");
                break;
            case 3:
                System.out.println("Jour " + jourInvalide + " : Mercredi");
                break;
            case 4:
                System.out.println("Jour " + jourInvalide + " : Jeudi");
                break;
            case 5:
                System.out.println("Jour " + jourInvalide + " : Vendredi");
                break;
            default:
                System.out.println("Jour " + jourInvalide + " : Jour invalide");
        }
    }
}
