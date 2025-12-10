public interface Calculatrice {
    // TODO : Déclarer une méthode abstraite int calculer(int a, int b)


    int calculer(int a, int b);
    // TODO : Créer une méthode par défaut void afficherResultat(int resultat)
    default void afficherResultat(int resultat){
        System.out.println("interface : "+resultat);
    };
    // TODO : Utiliser le mot-clé default
    // TODO : Afficher "Résultat : [resultat]"
    
}
