package org.example;

public class ValidateSaId {
    public static boolean isIdNumberValid(String idNumber) {
        // Basic format checks
        if (idNumber == null || idNumber.length() != 13 || !idNumber.matches("\\d+")) {
            return false;
        }

        // Validate DOB (YYMMDD)
        int month = Integer.parseInt(idNumber.substring(2, 4));
        int day = Integer.parseInt(idNumber.substring(4, 6));

        if (month < 1 || month > 12)
            return false;

        int maxDay = switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> 29; // simplified leap year handling
            default -> 31;
        };

        if (day < 1 || day > maxDay)
            return false;

        // If all checks pass
        return true;
    }
}