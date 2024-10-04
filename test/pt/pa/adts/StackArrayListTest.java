package pt.pa.adts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackArrayListTest {
    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new StackArrayList<>();
    }

    @Test
    void stackLIFO() {
        assertEquals(0, stack.size());

        for(int i = 1; i < 5; i++){
            stack.push(i);
            assertEquals(i, stack.size());
            assertEquals(i, stack.peek());
        }

        for(int i = 0; i < 4; i++) {
            int elem = stack.pop();
            assertEquals(4 - i, elem);
            assertEquals(4 - i - 1, stack.size());
        }
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}