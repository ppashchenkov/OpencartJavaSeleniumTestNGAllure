package opencart.utils;

import org.testng.ITestResult;

public class ReportUtils {
    public static String getStatus(ITestResult result) {
        if (result.getStatus() == 1) {
            return "PASS";
        } else if (result.getStatus() == 2) {
            return "FAIL";
        }
        return "-1";
    }
}
