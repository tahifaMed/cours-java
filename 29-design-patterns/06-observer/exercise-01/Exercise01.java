package cours.java.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        // Créer le sujet
        NewsAgency agency = new NewsAgency();
        
        // Créer les observateurs
        NewsChannel cnn = new NewsChannel("CNN");
        NewsChannel bbc = new NewsChannel("BBC");
        NewsChannel alJazeera = new NewsChannel("Al Jazeera");
        
        // Attacher les observateurs
        agency.attach(cnn);
        agency.attach(bbc);
        agency.attach(alJazeera);
        
        // Publier des news
        agency.publishNews("Breaking: Important event!");
        System.out.println();
        
        agency.publishNews("Technology: New innovation announced");
        System.out.println();
        
        // Détacher un observateur
        agency.detach(bbc);
        agency.publishNews("Breaking: Exclusive update");
    }
}

// TODO: Créer l'interface Observer
// 1. Méthode update(String news)

// TODO: Créer NewsChannel
// 1. Implémente Observer
// 2. Stocke String name
// 3. update(String) affiche "[name] received: [news]"

// TODO: Créer NewsAgency
// 1. List<Observer> observers
// 2. attach(Observer), detach(Observer), notifyObservers(String)
// 3. publishNews(String) appelle notifyObservers
