// TODO : Faire hériter Voiture de Vehicule
public class Voiture extends Vehicule {
    int nombrePortes;

    public Voiture(String marque, int annee) {
        super(marque, annee);
    }

    @Override
    public String volant() {
        return "volant rond";
    }

    // TODO : Créer un constructeur Voiture(String marque, int annee, int nombrePortes)
    // TODO : Utiliser super(marque, annee)
    
    // TODO : Redéfinir demarrer()
    // TODO : Afficher "La voiture démarre avec la clé"
    
}
