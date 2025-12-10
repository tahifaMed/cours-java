package cours.java.designpatterns.factory;

public class Exercise03 {
    public static void main(String[] args) {
        // Créer la factory de cartes de crédit
//        PaymentFactory creditCardFactory = PaymentProvider.creerFactory("credit");
//        System.out.println("Factory pour Carte de Crédit créée");
//
//        // Créer et utiliser un paiement par carte de crédit
//        PaymentMethod creditCardPayment = creditCardFactory.creerPaymentMethod();
//        System.out.println("Paiement par Carte de Crédit créé");
//        creditCardPayment.payer(100.0);
//        System.out.println();
//
//        // Créer la factory PayPal
//        PaymentFactory paypalFactory = PaymentProvider.creerFactory("paypal");
//        System.out.println("Factory pour PayPal créée");
//
//        // Créer et utiliser un paiement PayPal
//        PaymentMethod paypalPayment = paypalFactory.creerPaymentMethod();
//        System.out.println("Paiement par PayPal créé");
//        paypalPayment.payer(150.0);
//        System.out.println();
//
//        // Tester les paiements via les factories
//        System.out.println("Test de paiement Carte de Crédit:");
//        creditCardFactory.testerPayment();
//        System.out.println();
//
//        System.out.println("Test de paiement PayPal:");
//        paypalFactory.testerPayment();
    }
}

// TODO: Créer l'interface PaymentMethod
// 1. Méthode payer(double montant) qui affiche "[TYPE]: Paiement de [montant]€ effectué"
// 2. Méthode getType() qui retourne le type de paiement

// TODO: Créer la classe abstraite PaymentFactory
// 1. Factory Method abstraite PaymentMethod creerPaymentMethod()
// 2. Méthode concrète testerPayment() qui utilise creerPaymentMethod()

// TODO: Créer PaymentProvider (Simple Factory)
// 1. Méthode statique creerFactory(String type)
// 2. Retourner la bonne factory selon le type

// TODO: Implémenter CreditCardFactory et PayPalFactory
// 1. Each extends PaymentFactory
// 2. Override creerPaymentMethod()

// TODO: Implémenter CreditCardPayment et PayPalPayment
// 1. Each implements PaymentMethod
// 2. Implement payer() and getType()

