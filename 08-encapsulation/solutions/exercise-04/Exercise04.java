public class Exercise04 {
    public static void main(String[] args) {
        ExempleAcces obj = new ExempleAcces();
        
        System.out.println("Variable publique : " + obj.publicVar);
        System.out.println("Variable protégée : " + obj.protectedVar);
        System.out.println("Variable package : " + obj.packageVar);
        // System.out.println("Variable privée : " + obj.privateVar); // ERREUR
        System.out.println("Variable privée (via getter) : " + obj.getPrivateVar());
    }
}
