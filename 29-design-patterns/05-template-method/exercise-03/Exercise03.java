package cours.java.designpatterns.templatemethod;

public class Exercise03 {
    public static void main(String[] args) {
        // Initialiser des jeux
        Game chess = new Chess();
        Game monopoly = new Monopoly();
        
        System.out.println("=== JEU D'ÉCHECS ===");
        chess.play();
        
        System.out.println(" === MONOPOLY ===");
        monopoly.play();
    }
}

// TODO: Créer Game (classe abstraite)
// 1. Template method: play()
// 2. Steps: initialize(), startPlay(), endPlay()
// 3. Hook optionnel: canPlayAgain()

// TODO: Implémenter Chess et Monopoly
