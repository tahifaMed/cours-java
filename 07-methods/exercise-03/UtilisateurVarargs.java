public class UtilisateurVarargs {
    // TODO : Créer une méthode publique int somme(int... nombres)
    public int somme(int... nombres){
        int total = 0;
        for (int nombre:nombres){
            System.out.println("nombres = " + nombres);
            total += nombre;
        }
        return total;
    }
    // TODO : Utiliser une boucle for-each pour parcourir nombres
    // TODO : Initialiser une variable total à 0
    // TODO : Ajouter chaque nombre à total
    // TODO : Retourner total
    
    // TODO : Créer une méthode publique void afficherMessages(String... messages)
    // TODO : Utiliser une boucle for-each pour parcourir messages
    // TODO : Afficher chaque message avec "Message [index] : [message]"
    // TODO : Utiliser un compteur pour l'index

    public void afficherMessage(int... nombres){
        int count = 0;
        for (int nombre:nombres){
            System.out.println("Messages"+ count +" " + nombre);
            count++;
        }
    }
}
