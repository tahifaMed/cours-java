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

abstract class Game {
    public final void play() {
        initialize();
        startPlay();
        endPlay();
        canPlayAgain();
    }
    
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();
    
    protected void canPlayAgain() {
        System.out.println("Encore une partie? Non");
    }
}

class Chess extends Game {
    @Override
    protected void initialize() {
        System.out.println("Initialisation: Échiquier préparé");
    }
    
    @Override
    protected void startPlay() {
        System.out.println("Début: Les blancs jouent en premier");
    }
    
    @Override
    protected void endPlay() {
        System.out.println("Fin: Échec et mat!");
    }
}

class Monopoly extends Game {
    @Override
    protected void initialize() {
        System.out.println("Initialisation: Plateau et argent distribués");
    }
    
    @Override
    protected void startPlay() {
        System.out.println("Début: Premier joueur lance les dés");
    }
    
    @Override
    protected void endPlay() {
        System.out.println("Fin: Un joueur fait faillite");
    }
    
    @Override
    protected void canPlayAgain() {
        System.out.println("Encore une partie? Oui");
    }
}
