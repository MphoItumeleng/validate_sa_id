package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidateSaIdTest {
    @Test
    void validIdsShouldPass() {
        assertTrue(ValidateSaId.isIdNumberValid("2001014800086"));
        assertTrue(ValidateSaId.isIdNumberValid("2909035800085"));
    }

    @Test
    void tooShortFails() {
        assertFalse(ValidateSaId.isIdNumberValid("200101480008"));
    }

    @Test
    void tooLongFails() {
        assertFalse(ValidateSaId.isIdNumberValid("20010148000861"));
    }

    @Test
    void nonNumericFails() {
        assertFalse(ValidateSaId.isIdNumberValid("20010A4800086"));
    }

    @Test
    void invalidMonthFails() {
        assertFalse(ValidateSaId.isIdNumberValid("2000014800086")); // month 00
        assertFalse(ValidateSaId.isIdNumberValid("2013134800086")); // month 13
    }

    @Test
    void invalidDayFails() {
        assertFalse(ValidateSaId.isIdNumberValid("2002304800086")); // Feb 30
    }

    @Test
    void invalidCitizenshipFails() {
        assertFalse(ValidateSaId.isIdNumberValid("2001014800286")); // position 10 must be '0' or '1'
    }

    @Test
    void invalidChecksumFails() {
        assertFalse(ValidateSaId.isIdNumberValid("2001014800087")); // change last digit of a known valid ID
    }
}
