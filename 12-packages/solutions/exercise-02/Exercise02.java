import com.exemple.utils.Calculatrice;
import com.exemple.utils.*;

public class Exercise02 {
    public static void main(String[] args) {
        int somme = Calculatrice.additionner(10, 5);
        System.out.println("Somme : " + somme);
        
        String majuscules = StringUtils.enMajuscules("bonjour");
        System.out.println("Chaîne en majuscules : " + majuscules);
    }
}
