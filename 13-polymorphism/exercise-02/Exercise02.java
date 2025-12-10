public class Exercise02 {
    public static void main(String[] args) {
        // TODO : Créer un tableau Animal[] de taille 3
        Animal2[] animaux = new Animal2[3];
        // TODO : Placer un Chien à l'index 0
        animaux[0] = new Chien2();
        
        // TODO : Placer un Chat à l'index 1
        animaux[1] = new Chat2();
        // TODO : Placer un Animal à l'index 2

        animaux[2] = new Chat2();
        for (int i = 0; i < animaux.length; i++) {
            animaux[i].faireDuBruit();
        }
        // TODO : Parcourir le tableau avec une boucle for-each
        // TODO : Appeler faireDuBruit() sur chaque animal
        // TODO : Chaque animal exécutera sa propre version (polymorphisme)
        
    }
}
