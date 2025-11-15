public class Exercise01 {
    public static void main(String[] args) {
        Avion avion = new Avion();
        Oiseau oiseau = new Oiseau();
        
        avion.voler();
        avion.atterrir();
        
        oiseau.voler();
        oiseau.atterrir();
    }
}
