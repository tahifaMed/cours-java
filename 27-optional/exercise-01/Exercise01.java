import java.util.Arrays;
import java.util.Optional;

public class Exercise01 {
    public static void main(String[] args) {
        Integer value = 10;
        Optional<Integer> opt = Optional.ofNullable(value);

        if(value != null) {
            value.compareTo(3);
        }
        else {
            throw new RuntimeException("Erreur");
        }

        opt.ifPresentOrElse(s -> {s.compareTo(3);}, ()-> {throw new RuntimeException("Erreur");});


        Optional<Integer> optPair = Optional.of(10);
        Optional<Integer> filtrePair = optPair.filter(n -> n % 2 == 0);
        filtrePair.ifPresent(System.out::println);
        if(filtrePair.isPresent()) {
            System.out.println(filtrePair.get());
        }

        String mail = "userexample.com";
        Optional<String> optEmail = Optional.of(mail);
        Optional<String> emailValide = optEmail.filter(e -> e.contains("@"));
        System.out.println("Email valide : " + emailValide.orElse("Invalide"));


    }
}

