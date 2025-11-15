package cours.java.designpatterns.templatemethod;

public class Exercise02 {
    public static void main(String[] args) {
        // Générer différents rapports
        ReportGenerator htmlReport = new HTMLReportGenerator();
        ReportGenerator pdfReport = new PDFReportGenerator();
        
        System.out.println("=== RAPPORT HTML ===");
        String htmlResult = htmlReport.generateReport("Données importantes");
        System.out.println(htmlResult);
        
        System.out.println(" === RAPPORT PDF ===");
        String pdfResult = pdfReport.generateReport("Données importantes");
        System.out.println(pdfResult);
    }
}

// TODO: Créer ReportGenerator (classe abstraite)
// 1. Template method: generateReport(String data)
// 2. Steps: createHeader(), createBody(String), createFooter()
// 3. Tous sont abstraits sauf generateReport()

// TODO: Implémenter HTMLReportGenerator et PDFReportGenerator
