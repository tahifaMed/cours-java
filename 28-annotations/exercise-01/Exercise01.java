import com.example.annotations.Personne;
import com.example.annotations.RestritionAge;

import java.lang.reflect.Field;

public class Exercise01 {
    

    
    public static void main(String[] args) {
        Personne personne = new Personne(0);
        
        try {
            Field ageField = Personne.class.getDeclaredField("age");
            ageField.setAccessible(true);
            
            if (ageField.isAnnotationPresent(RestritionAge.class)) {
                RestritionAge annotation = ageField.getAnnotation(RestritionAge.class);
                int min = annotation.min();
                int max = annotation.max();
                String message = annotation.message();
                
                int age = personne.getAge();
                if (age < min || age > max) {
                    System.out.println(message);
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        
        System.out.println(personne);
        
    }
}

