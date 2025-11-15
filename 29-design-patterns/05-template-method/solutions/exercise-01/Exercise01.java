package cours.java.designpatterns.templatemethod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise01 {
    public static void main(String[] args) throws IOException {
        // Créer des processeurs
        FileProcessor csvProcessor = new CSVFileProcessor();
        FileProcessor jsonProcessor = new JSONFileProcessor();
        
        // Créer des fichiers temporaires
        Path csvFile = Files.write(Files.createTempFile("test", ".csv"), 
            "Name,Age Alice,30 Bob,25".getBytes());
        Path jsonFile = Files.write(Files.createTempFile("test", ".json"), 
            "{\"name\":\"Alice\",\"age\":30}".getBytes());
        
        System.out.println("Traitement CSV:");
        csvProcessor.processFile(csvFile.toString());
        System.out.println();
        
        System.out.println("Traitement JSON:");
        jsonProcessor.processFile(jsonFile.toString());
        
        // Nettoyer
        Files.deleteIfExists(csvFile);
        Files.deleteIfExists(jsonFile);
    }
}

abstract class FileProcessor {
    private String loadedContent;
    
    public final void processFile(String filename) {
        loadedContent = loadFile(filename);
        String parsed = parseContent(loadedContent);
        validateContent(parsed);
        saveResult(parsed);
    }
    
    private String loadFile(String filename) {
        try {
            System.out.println("Chargement du fichier: " + filename);
            return new String(Files.readAllBytes(Path.of(filename)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    protected abstract String parseContent(String content);
    protected abstract void validateContent(String content);
    
    private void saveResult(String result) {
        System.out.println("Sauvegarde du résultat " + getType());
    }
    
    protected abstract String getType();
}

class CSVFileProcessor extends FileProcessor {
    @Override
    protected String parseContent(String content) {
        String parsed = content.replace(" ", " ");
        System.out.println("Parsing CSV: " + parsed);
        return parsed;
    }
    
    @Override
    protected void validateContent(String content) {
        System.out.println("Validation CSV réussie");
    }
    
    @Override
    protected String getType() {
        return "CSV";
    }
}

class JSONFileProcessor extends FileProcessor {
    @Override
    protected String parseContent(String content) {
        System.out.println("Parsing JSON: " + content);
        return content;
    }
    
    @Override
    protected void validateContent(String content) {
        System.out.println("Validation JSON réussie");
    }
    
    @Override
    protected String getType() {
        return "JSON";
    }
}
