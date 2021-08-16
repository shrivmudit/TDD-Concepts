import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {
    @Test
    void toReturnMinusFiveWhenAddingMinusTwentyFifteen() {
        Arithmetic res = new Arithmetic(-20, 15);
        int expectedSol = -5;
        int actualSol = res.sum();
        assertEquals(expectedSol, actualSol);
    }

    @Test
    void toReturnZeroaddminusFiveandFive() {
        Arithmetic res = new Arithmetic(-5, 5);
        int expectedSol = 0;
        int actualSol = res.sum();
        assertEquals(expectedSol, actualSol);
    }

    @Test
    void toReturnZeroSubtractFiveandFive() {
        Arithmetic res = new Arithmetic(5, 5);
        int expectedSol = 0;
        int actualSol = res.subtract();
        assertEquals(expectedSol, actualSol);
    }

    @Test
    void toReturnNegativeSubtractminusTwentyandten() {
        Arithmetic res = new Arithmetic(-20, 10);
        int expectedSol = -30;
        int actualSol = res.subtract();
        assertEquals(expectedSol, actualSol);
    }

    @Test
    void toReturnPositiveusingtwoNegative() {
        Arithmetic res = new Arithmetic(-10, -5);
        int expectedSol = 50;
        int actualSol = res.multiply();
        assertEquals(expectedSol, actualSol);
    }

    @Test
    void toReturntwotimeof10() {
        Arithmetic res = new Arithmetic(10, 10);
        int expectedSol = 100;
        int actualSol = res.multiply();
        assertEquals(expectedSol, actualSol);
    }

    @Test
    void toReturnpositivebydivingtwonegative() {
        Arithmetic res = new Arithmetic(-10, -5);
        int expectedSol = 2;
        int actualSol = res.divide();
        assertEquals(expectedSol, actualSol);
    }

    @Test
    void toReturnNegative() {
        Arithmetic res = new Arithmetic(-20, 10);
        int expectedSol = -2;
        int actualSol = res.divide();
        assertEquals(expectedSol, actualSol);
    }
}


