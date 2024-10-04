package pt.pa.adts;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {

    @org.junit.jupiter.api.Test
    void decimal2Binary() {
        assertEquals("1010", DecimalToBinary.decimal2Binary(10));
        assertEquals("0", DecimalToBinary.decimal2Binary(0));
    }

    void decimal2Binary_ExceptionWhenNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            DecimalToBinary.decimal2Binary((-5));
        });
    }
}