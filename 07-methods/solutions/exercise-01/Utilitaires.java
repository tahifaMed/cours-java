public class Utilitaires {
    public void saluer() {
        System.out.println("Bonjour !");
    }
    
    public void saluerPersonne(String nom) {
        System.out.println("Bonjour " + nom + " !");
    }
    
    public int calculerCarre(int nombre) {
        return nombre * nombre;
    }
    
    public double calculerMoyenne(double a, double b) {
        return (a + b) / 2.0;
    }
}
