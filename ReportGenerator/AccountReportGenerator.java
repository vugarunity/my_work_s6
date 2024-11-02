public class AccountReportGenerator {
    private final ReportGenerator reportGenerator;

    public AccountReportGenerator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public String generateReport() {
        return reportGenerator.generateReport();
    }
}