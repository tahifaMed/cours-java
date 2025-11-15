public class Exercise02 {
    public static void main(String[] args) {
        String texte = "Bonjour le monde";
        
        int indexJ = texte.indexOf('j');
        System.out.println("Index de 'j' : " + indexJ);
        
        int indexMonde = texte.indexOf("monde");
        System.out.println("Index de 'monde' : " + indexMonde);
        
        String aPartirDe8 = texte.substring(8);
        System.out.println("À partir de l'index 8 : " + aPartirDe8);
        
        String de0a7 = texte.substring(0, 7);
        System.out.println("De 0 à 7 : " + de0a7);
        
        int indexMonde2 = texte.indexOf("monde");
        String motMonde = texte.substring(indexMonde2);
        System.out.println("Le mot 'monde' : " + motMonde);
        
        int indexLe = texte.indexOf("le");
        String motLe = texte.substring(indexLe, indexLe + 2);
        System.out.println("Le mot 'le' : " + motLe);
    }
}

