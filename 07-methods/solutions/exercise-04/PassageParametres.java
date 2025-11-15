public class PassageParametres {
    public void modifierPrimitif(int x) {
        x = 100;  // Ne modifie que la copie locale
    }
    
    public void modifierObjet(int[] tableau) {
        tableau[0] = 100;  // Modifie l'objet original
    }
}
