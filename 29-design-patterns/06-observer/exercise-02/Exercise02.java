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

// TODO: Créer AlertObserver interface
// 1. alert(String type, double temp)

// TODO: Implémenter EmailAlert, SMSAlert, ConsoleAlert

// TODO: Créer TemperatureSensor
// 1. notifyObservers() quand température change
// 2. setTemperature(double) avec notification
