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

interface EventListener<T> {
    void handle(T event);
}

class UserCreatedEvent {
    private String username;
    
    public UserCreatedEvent(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }
}

class ProductSoldEvent {
    private String product;
    
    public ProductSoldEvent(String product) {
        this.product = product;
    }
    
    public String getProduct() {
        return product;
    }
}

class EmailService implements EventListener<UserCreatedEvent>, EventListener<ProductSoldEvent> {
    @Override
    public void handle(UserCreatedEvent event) {
        System.out.println("✅ Email sent to " + event.getUsername() + "@example.com");
    }
    
    @Override
    public void handle(ProductSoldEvent event) {
        System.out.println("✅ Email sent to customer@example.com");
    }
}

class LoggingService implements EventListener<UserCreatedEvent> {
    @Override
    public void handle(UserCreatedEvent event) {
        System.out.println("✅ Logged: User " + event.getUsername() + " registered");
    }
}

class AnalyticsService implements EventListener<UserCreatedEvent>, EventListener<ProductSoldEvent> {
    @Override
    public void handle(UserCreatedEvent event) {
        System.out.println("✅ Analytics: User registered");
    }
    
    @Override
    public void handle(ProductSoldEvent event) {
        System.out.println("✅ Analytics: Product sold");
    }
}

interface EventBus {
    <T> void registerListener(Class<T> eventType, EventListener<T> listener);
    <T> void publish(T event);
}

class SimpleEventBus implements EventBus {
    private Map<Class<?>, List<EventListener<?>>> listeners = new HashMap<>();
    
    @Override
    @SuppressWarnings("unchecked")
    public <T> void registerListener(Class<T> eventType, EventListener<T> listener) {
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <T> void publish(T event) {
        List<EventListener<?>> eventListeners = listeners.get(event.getClass());
        if (eventListeners != null) {
            for (EventListener<?> listener : eventListeners) {
                ((EventListener<T>) listener).handle(event);
            }
        }
        
        System.out.println(getEventType(event) + " event published");
    }
    
    private String getEventType(Object event) {
        if (event instanceof UserCreatedEvent) {
            UserCreatedEvent e = (UserCreatedEvent) event;
            return "User " + e.getUsername() + " created successfully";
        } else if (event instanceof ProductSoldEvent) {
            ProductSoldEvent e = (ProductSoldEvent) event;
            return "Product " + e.getProduct() + " sold";
        }
        return "Event published";
    }
}
