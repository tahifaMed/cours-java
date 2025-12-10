import exceptions.AgeException;
import exceptions.AmountException;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise01 {

    public Exercise01() {}
    public static void main(String[] args) throws Exception {
        try {
            int resultat = 10 / 0;  // ArithmeticException
        } catch (NullPointerException | ArithmeticException  e) {
            System.err.println("Erreur : Division par zéro");
        }  catch (RuntimeException  e) {
            System.err.println("Runtime Exceptipn");
        } catch(Exception e) {
            System.err.println("Erreur : erreur globale");
        }



            validateValues();

        System.out.println("Fin du programme");

    }

    private static void validateValues() throws Exception {
        List<Integer> ages = Arrays.asList(10, 20, 300, 40, 50, 60, 70, 80, 99);
        for (Integer i : ages) {


                Exercise01.checkAge(i);
                Exercise01.checkAmount(i);
                System.out.println(i);

        }
    }

    public static void checkAge(int age) throws Exception {
        if (age < 0 || age > 100) {
            throw new AgeException("age is not valid");
        }
    }
    public static void checkAmount(int amount) throws Exception {
        if (amount < 50) {
            throw new AmountException("amount is not valid");
        }
    }


}



