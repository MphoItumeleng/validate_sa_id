package org.example;

public class ValidateSaId {
    public static boolean isIdNumberValid(String idNumber) {
        if (idNumber == null || !idNumber.matches("\\d{13}")) {
            return false;
        }
        return true;
    }
}
