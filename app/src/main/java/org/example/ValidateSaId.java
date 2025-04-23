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

        // Citizenship digit (11th digit must be 0 or 1)
        char citizen = idNumber.charAt(10);
        if (citizen != '0' && citizen != '1')
            return false;

        // Luhn algorithm validation
        if (!luhnCheck(idNumber))
            return false;

        // If all checks pass
        return true;
    }

    private static boolean luhnCheck(String s) {
        int sum = 0;
        boolean alt = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            int n = s.charAt(i) - '0';
            if (alt) {
                n *= 2;
                if (n > 9)
                    n = (n % 10) + 1;
            }
            sum += n;
            alt = !alt;
        }
        return sum % 10 == 0;
    }
}