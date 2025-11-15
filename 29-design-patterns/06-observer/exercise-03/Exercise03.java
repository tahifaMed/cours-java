package cours.java.designpatterns.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise03 {
    public static void main(String[] args) {
        // Create event bus
        EventBus eventBus = new SimpleEventBus();
        
        // Register listeners
        eventBus.registerListener(UserCreatedEvent.class, new EmailService());
        eventBus.registerListener(UserCreatedEvent.class, new LoggingService());
        eventBus.registerListener(UserCreatedEvent.class, new AnalyticsService());
        eventBus.registerListener(ProductSoldEvent.class, new EmailService());
        eventBus.registerListener(ProductSoldEvent.class, new AnalyticsService());
        
        // Publish events
        eventBus.publish(new UserCreatedEvent("bob"));
        System.out.println();
        
        eventBus.publish(new ProductSoldEvent("iPhone"));
    }
}

// TODO: Créer EventListener interface générique
// 1. void handle(T event)

// TODO: Créer événements: UserCreatedEvent, ProductSoldEvent

// TODO: Créer listeners: EmailService, LoggingService, AnalyticsService

// TODO: Créer EventBus
// 1. registerListener(Class<T>, EventListener<T>)
// 2. publish(T event)
