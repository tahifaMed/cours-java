public class Exercise04 {
    public static void main(String[] args) {
        boolean vrai = true;
        boolean faux = false;
        
        boolean et1 = vrai && vrai;
        System.out.println("true && true : " + et1);
        
        boolean et2 = vrai && faux;
        System.out.println("true && false : " + et2);
        
        boolean ou1 = vrai || faux;
        System.out.println("true || false : " + ou1);
        
        boolean ou2 = faux || faux;
        System.out.println("false || false : " + ou2);
        
        boolean non1 = !vrai;
        System.out.println("!true : " + non1);
        
        boolean non2 = !faux;
        System.out.println("!false : " + non2);
        
        boolean combine = (vrai && faux) || vrai;
        System.out.println("(true && false) || true : " + combine);
    }
}
