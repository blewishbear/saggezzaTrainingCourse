package com.spring.saggezza.technicalclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsIntegerTest {

    private IIsInteger isInteger;

    @BeforeEach
    public void setup() {
        this.isInteger = new IsInteger();
    }

    @Test
    public void userGiven1getTrue(){
        // Given: I am a user
        // When: I enter the string "1"
        boolean result = isInteger.isTypeInt("1");
        // Then: I get back TRUE
        assertTrue(result);
    }

    @Test
    public void userGivenBobGetFalse(){
        // Given: I am a user
        // When: I enter the string "bob"
        boolean result = isInteger.isTypeInt("bob");
        // Then: I get back TRUE
        assertFalse(result);
    }

    @Test
    public void userGivenFloatGetFalse(){
        // Given: I am a user
        // When: I enter the string "bob"
        boolean result = isInteger.isTypeInt("2.5");
        // Then: I get back TRUE
        assertFalse(result);
    }

    @Test
    public void userGivenNegative4GetTrue(){
        // Given: I am a user
        // When: I enter the string "bob"
        boolean result = isInteger.isTypeInt("-4");
        // Then: I get back TRUE
        assertTrue(result);
    }


}
