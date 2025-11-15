public class Exercise03 {
    
    // TODO : Créer une annotation avec RUNTIME retention
    // TODO : @Retention(RetentionPolicy.RUNTIME)
    // TODO : @Target(ElementType.TYPE)
    // TODO : @interface Description {
    // TODO :     String texte();
    // TODO : }
    
    // TODO : Appliquer l'annotation à une classe
    // TODO : @Description(texte = "Cette classe fait quelque chose d'utile")
    // TODO : static class MaClasseAnnotee {
    // TODO :     // Classe avec annotation
    // TODO : }
    
    public static void main(String[] args) {
        // TODO : Utiliser la réflexion pour lire l'annotation
        // TODO : Class<?> clazz = MaClasseAnnotee.class;
        
        // TODO : Vérifier si l'annotation est présente
        // TODO : boolean presente = clazz.isAnnotationPresent(Description.class);
        // TODO : System.out.println("Annotation présente : " + presente);
        
        // TODO : Récupérer l'annotation
        // TODO : if (presente) {
        // TODO :     Description desc = clazz.getAnnotation(Description.class);
        // TODO :     System.out.println("Description : " + desc.texte());
        // TODO : }
        
        // TODO : System.out.println("Classe traitée avec succès via réflexion");
        
    }
}

