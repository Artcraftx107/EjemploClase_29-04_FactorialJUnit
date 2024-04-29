/*
Test cases:
Factorial 0 ->1
Factorial 1 -> 1
Factorial 2 -> 2
Factorial 3 -> 6
factorial 4 -> 24
Factorial 5 -> 120
Factorial 10 -> 3,628,800
 */
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FactorialTest {
    private Factorial factorial;
    @BeforeEach
    void setUp(){
        factorial=new Factorial();
    }
    @AfterEach
    void tearDown(){
        factorial=null;
    }
    @Test
    void theFactorialOfZeroIsOne(){
        int value = 0;
        int obtainResult = factorial.compute(value);
        int expectedResult = 1;
        assertEquals(expectedResult, obtainResult);
    }

    @Test
    void theFactorialOfOneIsOne(){
        int value = 1;
        int expectedResult = 1;
        int obtainedResult = factorial.compute(value);
        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    void theFactorialOfTwoIsTwo(){
        int value = 2;
        int expectedResult = 2;
        int obtainResult = factorial.compute(value);
        assertEquals(expectedResult, obtainResult);
    }
    @Test
    void theFactorialOfThreeIsSix(){
        int value = 3;
        int expectedResult = 6;
        int obtainResult = factorial.compute(value);
        assertEquals(expectedResult, obtainResult);
    }
    @Test
    void theFactorialOfFourIsTwentyFour(){
        int value = 4;
        int expectedResult = 24;
        int obtainResult = factorial.compute(value);
        assertEquals(expectedResult, obtainResult);
    }
    @Test
    void theFactorialOfFiveIs120(){
        int value = 5;
        int expectedResult = 120;
        int obtainResult = factorial.compute(value);
        assertEquals(expectedResult, obtainResult);
    }
    @Test
    void testFactorialOfTen(){
        int value = 10;
        int expectedResult = 3628800;
        int obtainResult = factorial.compute(value);
        assertEquals(expectedResult, obtainResult);
    }
}
