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

interface Observer {
    void update(String news);
}

class NewsChannel implements Observer {
    private String name;
    
    public NewsChannel(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String news) {
        System.out.println(name + " received: " + news);
    }
}

class NewsAgency {
    private List<Observer> observers = new ArrayList<>();
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    private void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
    
    public void publishNews(String news) {
        System.out.println(news);
        notifyObservers(news);
    }
}
