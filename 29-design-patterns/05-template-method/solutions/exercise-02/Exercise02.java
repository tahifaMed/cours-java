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

abstract class ReportGenerator {
    public final String generateReport(String data) {
        String header = createHeader();
        String body = createBody(data);
        String footer = createFooter();
        return header + body + footer;
    }
    
    protected abstract String createHeader();
    protected abstract String createBody(String data);
    protected abstract String createFooter();
}

class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected String createHeader() {
        return "<html><head><title>Rapport</title></head> <body> ";
    }
    
    @Override
    protected String createBody(String data) {
        return "<h1>" + data + "</h1> ";
    }
    
    @Override
    protected String createFooter() {
        return "</body></html> ";
    }
}

class PDFReportGenerator extends ReportGenerator {
    @Override
    protected String createHeader() {
        return "PDF Document ";
    }
    
    @Override
    protected String createBody(String data) {
        return "============= " + data + " ============= ";
    }
    
    @Override
    protected String createFooter() {
        return "End of PDF ";
    }
}
