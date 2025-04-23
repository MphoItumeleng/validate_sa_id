package org.example;

public class ValidateSaId {
    public static boolean isIdNumberValid(String idNumber) {
        if (idNumber == null || idNumber.length() != 13 || !idNumber.matches("\\d+")) {
            return false;
        }
        return true;
    }
}
