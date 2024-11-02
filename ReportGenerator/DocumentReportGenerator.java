public class DocumentReportGenerator {
    private final ReportGenerator reportGenerator;

    public DocumentReportGenerator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public String generateReport() {
        return reportGenerator.generateReport();
    }
}