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

// TODO: Créer la classe abstraite FileProcessor
// 1. Template method: processFile(String filename)
// 2. Steps: loadFile(), parseContent(), validateContent(), saveResult()
// 3. loadFile() et saveResult() sont communs
// 4. parseContent() et validateContent() sont abstraits

// TODO: Implémenter CSVFileProcessor et JSONFileProcessor
// 1. Redéfinir parseContent() et validateContent()
