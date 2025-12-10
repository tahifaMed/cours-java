public class Lieu {

    private String nom;
    private Integer codePostal;
    private Long nombreDhabitant;

    public

    Lieu(String nom, Integer codePostal, Long nombreDhabitant) {
        this.nom = nom;
        this.codePostal = codePostal;
        this.nombreDhabitant = nombreDhabitant;
    }

    @Override
    public String toString() {
        return "Lieu{" +
                "nom='" + nom + '\'' +
                ", codePostal=" + codePostal +
                ", nombreDhabitant=" + nombreDhabitant +
                '}';
    }
}
