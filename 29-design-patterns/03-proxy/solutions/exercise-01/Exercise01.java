package cours.java.designpatterns.proxy;

public class Exercise01 {
    public static void main(String[] args) {
        // Créer des proxies (images pas encore chargées)
        Image image1 = new ImageProxy("photo1.jpg");
        System.out.println("Création du proxy pour: photo1.jpg");
        
        Image image2 = new ImageProxy("photo2.jpg");
        System.out.println("Création du proxy pour: photo2.jpg");
        System.out.println();
        
        // Afficher la première image (chargement maintenant)
        System.out.println("Affichage de photo1.jpg...");
        image1.afficher();
        System.out.println();
        
        // Afficher la deuxième image (chargement maintenant)
        System.out.println("Affichage de photo2.jpg...");
        image2.afficher();
        System.out.println();
        
        // Réafficher la première image (déjà chargée)
        System.out.println("Affichage de photo1.jpg...");
        image1.afficher();
    }
}

interface Image {
    void afficher();
}

class RealImage implements Image {
    private String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
    
    private void loadFromDisk() {
        System.out.println("Chargement de " + filename + " depuis le disque");
    }
    
    @Override
    public void afficher() {
        System.out.println("Affichage: " + filename);
    }
}

class ImageProxy implements Image {
    private RealImage realImage;
    private String filename;
    
    public ImageProxy(String filename) {
        this.filename = filename;
    }
    
    @Override
    public void afficher() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.afficher();
    }
}
