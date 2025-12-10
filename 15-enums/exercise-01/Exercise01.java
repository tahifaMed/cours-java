public class Exercise01 {
    public static void main(String[] args) {
        // TODO : Créer un enum JourSemaine avec les jours de la semaine
        // TODO : LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE
        
        // TODO : Créer une variable aujourdhui de type JourSemaine
        // TODO : JourSemaine aujourdhui = JourSemaine.LUNDI;
        // TODO : System.out.println("Aujourd'hui : " + aujourdhui);
        
        // TODO : Parcourir toutes les valeurs de l'enum avec values()
        // TODO : System.out.println("Tous les jours de la semaine :");
        // TODO : for (JourSemaine jour : JourSemaine.values()) {
        // TODO :     System.out.println(jour);
        // TODO : }
        
    }

    public enum Source {
        CASS_OPENDATA("Cour de Cassation de l'openData"),
        LEGI_CETAT("Cour des comptes pour les sénats");

        private String descripton;
        private Source(String descripton) {
            this.descripton = descripton;
        }
    }
}

