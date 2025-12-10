package cours.java.designpatterns.proxy;

public class Exercise01 {
    public static void main(String[] args) {
        // Créer des proxies (images pas encore chargées)
//        Image image1 = new ImageProxy("photo1.jpg");
//        System.out.println("Création du proxy pour: photo1.jpg");
//
//        Image image2 = new ImageProxy("photo2.jpg");
//        System.out.println("Création du proxy pour: photo2.jpg");
//        System.out.println();
//
//        // Afficher la première image (chargement maintenant)
//        System.out.println("Affichage de photo1.jpg...");
//        image1.afficher();
//        System.out.println();
//
//        // Afficher la deuxième image (chargement maintenant)
//        System.out.println("Affichage de photo2.jpg...");
//        image2.afficher();
//        System.out.println();
//
//        // Réafficher la première image (déjà chargée)
//        System.out.println("Affichage de photo1.jpg...");
//        image1.afficher();
    }
}

// TODO: Créer l'interface Image
// 1. Méthode afficher()

// TODO: Créer RealImage
// 1. Implémente Image
// 2. Constructeur prend String filename
// 3. Dans constructeur: afficher "Chargement de [filename] depuis le disque"
// 4. Dans afficher(): afficher "Affichage: [filename]"

// TODO: Créer ImageProxy
// 1. Implémente Image
// 2. Stocke String filename et RealImage realImage
// 3. Dans afficher(): créer RealImage si null, puis appeler afficher() dessus
