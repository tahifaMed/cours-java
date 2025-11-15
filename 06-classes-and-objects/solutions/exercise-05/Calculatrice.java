public class Calculatrice {
    public int additionner(int a, int b) {
        return a + b;
    }
    
    public double multiplier(double x, double y) {
        return x * y;
    }
    
    public boolean estPair(int nombre) {
        return nombre % 2 == 0;
    }
    
    public void afficherMessage(String message) {
        System.out.println("Message : " + message);
    }
}
