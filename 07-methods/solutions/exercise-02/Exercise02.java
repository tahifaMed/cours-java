public class Exercise02 {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        
        System.out.println(calc.additionner(5, 3));
        System.out.println(calc.additionner(5.5, 3.2));
        System.out.println(calc.additionner(1, 2, 3));
    }
}
