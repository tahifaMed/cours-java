public class Exercise03 {
    public static void main(String[] args) {
        VoitureElectrique tesla = new VoitureElectrique("Tesla", 2023, 4, 500);
        
        tesla.demarrer();
        
        System.out.println("Marque : " + tesla.marque);
        System.out.println("Nombre de portes : " + tesla.nombrePortes);
        System.out.println("Autonomie : " + tesla.autonomieBatterie + " km");
        
        tesla.charger();
    }
}
