public class Compteur {
    int valeur;
    static int nombreInstances = 0;
    
    public Compteur() {
        valeur = 0;
        nombreInstances++;
    }
    
    public void incrementer() {
        valeur++;
    }
    
    public static int getNombreInstances() {
        return nombreInstances;
    }
}
