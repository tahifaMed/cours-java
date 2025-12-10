public class Voiture {
    private String name;
    private int nombreDeSiege;

    public Voiture(){}

    public Voiture(String name, int nombreDeSiege) {
        this.name = name;
        this.nombreDeSiege = nombreDeSiege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNombreDeSiege() {
        return nombreDeSiege;
    }

    public void setNombreDeSiege(int nombreDeSiege) {
        this.nombreDeSiege = nombreDeSiege;
    }

    public String getVoitureName(){
        return name+" "+nombreDeSiege;
    }

    public String getVoitureName(String nombreDeChevaux){
        return name+" "+nombreDeSiege+ " "+nombreDeChevaux;
    }

    public int maximum(int a, int b){
        return a>b?a:b;
    }
    
}
