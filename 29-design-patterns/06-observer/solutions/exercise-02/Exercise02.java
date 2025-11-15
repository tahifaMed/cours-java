package cours.java.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        
        AlertObserver emailAlert = new EmailAlert("admin@example.com");
        AlertObserver smsAlert = new SMSAlert("+33123456789");
        AlertObserver consoleAlert = new ConsoleAlert();
        
        sensor.attach(emailAlert);
        sensor.attach(smsAlert);
        sensor.attach(consoleAlert);
        
        sensor.setTemperature(25);
        System.out.println();
        sensor.setTemperature(35);
        System.out.println();
        sensor.setTemperature(5);
    }
}

interface AlertObserver {
    void alert(String type, double temperature);
}

class EmailAlert implements AlertObserver {
    private String email;
    
    public EmailAlert(String email) {
        this.email = email;
    }
    
    @Override
    public void alert(String type, double temperature) {
        System.out.println("📧 Email to " + email + ": ALERT: Température " + type + " " + temperature + "°C");
    }
}

class SMSAlert implements AlertObserver {
    private String phone;
    
    public SMSAlert(String phone) {
        this.phone = phone;
    }
    
    @Override
    public void alert(String type, double temperature) {
        System.out.println("📱 SMS to " + phone + ": Température " + type + "!");
    }
}

class ConsoleAlert implements AlertObserver {
    @Override
    public void alert(String type, double temperature) {
        if ("normale".equals(type)) {
            System.out.println("Console Alert: Temperature normale");
        } else {
            System.out.println("Console Alert: Température " + type + "!");
        }
    }
}

class TemperatureSensor {
    private List<AlertObserver> observers = new ArrayList<>();
    private double temperature;
    
    public void attach(AlertObserver observer) {
        observers.add(observer);
    }
    
    private void notifyObservers() {
        String type;
        if (temperature > 30) {
            type = "élevée";
        } else if (temperature < 10) {
            type = "basse";
        } else {
            type = "normale";
        }
        
        for (AlertObserver observer : observers) {
            observer.alert(type, temperature);
        }
    }
    
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println("Temperature: " + temperature + "°C");
        notifyObservers();
    }
}
