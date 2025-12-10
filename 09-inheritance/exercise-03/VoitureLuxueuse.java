public class VoitureLuxueuse extends Vehicule implements SiegeChauffant {


    public VoitureLuxueuse(String marque, int annee) {
        super(marque, annee);
    }

    @Override
    public int niveauChauffage() {
        return 5;
    }

    @Override
    public String volant() {
        return "Volant en cuir";
    }
}
