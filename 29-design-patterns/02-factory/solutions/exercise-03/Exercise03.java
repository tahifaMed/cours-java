package cours.java.designpatterns.factory;

public class Exercise03 {
    public static void main(String[] args) {
        // Créer la factory de cartes de crédit
        PaymentFactory creditCardFactory = PaymentProvider.creerFactory("credit");
        System.out.println("Factory pour Carte de Crédit créée");
        
        // Créer et utiliser un paiement par carte de crédit
        PaymentMethod creditCardPayment = creditCardFactory.creerPaymentMethod();
        System.out.println("Paiement par Carte de Crédit créé");
        creditCardPayment.payer(100.0);
        System.out.println();
        
        // Créer la factory PayPal
        PaymentFactory paypalFactory = PaymentProvider.creerFactory("paypal");
        System.out.println("Factory pour PayPal créée");
        
        // Créer et utiliser un paiement PayPal
        PaymentMethod paypalPayment = paypalFactory.creerPaymentMethod();
        System.out.println("Paiement par PayPal créé");
        paypalPayment.payer(150.0);
        System.out.println();
        
        // Tester les paiements via les factories
        System.out.println("Test de paiement Carte de Crédit:");
        creditCardFactory.testerPayment();
        System.out.println();
        
        System.out.println("Test de paiement PayPal:");
        paypalFactory.testerPayment();
    }
}

interface PaymentMethod {
    boolean payer(double montant);
    String getType();
}

abstract class PaymentFactory {
    abstract PaymentMethod creerPaymentMethod();
    
    public void testerPayment() {
        PaymentMethod payment = creerPaymentMethod();
        payment.payer(99.99);
    }
}

class PaymentProvider {
    public static PaymentFactory creerFactory(String type) {
        return switch (type.toLowerCase()) {
            case "credit" -> new CreditCardFactory();
            case "paypal" -> new PayPalFactory();
            default -> throw new IllegalArgumentException("Type de paiement inconnu: " + type);
        };
    }
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean payer(double montant) {
        System.out.println("Carte de Crédit: Paiement de " + montant + "€ effectué");
        return true;
    }
    
    @Override
    public String getType() {
        return "Carte de Crédit";
    }
}

class PayPalPayment implements PaymentMethod {
    @Override
    public boolean payer(double montant) {
        System.out.println("PayPal: Paiement de " + montant + "€ effectué");
        return true;
    }
    
    @Override
    public String getType() {
        return "PayPal";
    }
}

class CreditCardFactory extends PaymentFactory {
    @Override
    public PaymentMethod creerPaymentMethod() {
        return new CreditCardPayment();
    }
}

class PayPalFactory extends PaymentFactory {
    @Override
    public PaymentMethod creerPaymentMethod() {
        return new PayPalPayment();
    }
}
