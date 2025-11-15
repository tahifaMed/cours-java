public class Exercise04 {
    public static void main(String[] args) {
        PassageParametres p = new PassageParametres();
        
        int nombre = 5;
        System.out.println("Avant modification : nombre = " + nombre);
        p.modifierPrimitif(nombre);
        System.out.println("Après modifierPrimitif : nombre = " + nombre);
        
        int[] arr = {1, 2, 3};
        System.out.println("Avant modification : arr[0] = " + arr[0]);
        p.modifierObjet(arr);
        System.out.println("Après modifierObjet : arr[0] = " + arr[0]);
    }
}
