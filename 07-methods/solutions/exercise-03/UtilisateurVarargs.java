public class UtilisateurVarargs {
    public int somme(int... nombres) {
        int total = 0;
        for (int n : nombres) {
            total += n;
        }
        return total;
    }
    
    public void afficherMessages(String... messages) {
        int index = 1;
        for (String msg : messages) {
            System.out.println("Message " + index + " : " + msg);
            index++;
        }
    }
}
