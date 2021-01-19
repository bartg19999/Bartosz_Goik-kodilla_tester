package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @NullAndEmptySource
    public void cantLeaveBlank(String username){
        assertFalse(validator.validateUsername(" "));
    }
    @ParameterizedTest
    @ValueSource(strings = {"Kamil121", "Maciek758"})
    public void canContainNumbers(String username){
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void cantLeaveBlankEmail(String email){
        assertFalse(validator.validateEmail(" "));
    }
    @ParameterizedTest
    @ValueSource(strings = {"Tomasz@gmail.com", "krzysztof@wp.pl"})
    public void canHaveEmailStructure(String email){
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"b¹k@onet.pl"})
    public void cantContainPolishLetters(String email){
        boolean result = validator.validateEmail(email);
        assertFalse(result);
    }

}