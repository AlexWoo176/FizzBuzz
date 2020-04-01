import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzNumberTest {

    public static final String FIZZBUZZ = "FIZZBUZZ";
    public static final String FIZZ = "FIZZ";
    public static final String BUZZ = "BUZZ";

    @Test
    @DisplayName("Display FIZZ")
    void fizzNumber() {
        int number = 3;
        String expected = FIZZ;
        String result = FizzBuzzNumber.fizzBuzzNumber(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Display BUZZ")
    void buzzNumber() {
        int number = 5;
        String expected = BUZZ;
        String result = FizzBuzzNumber.fizzBuzzNumber(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Display FIZZBUZZ")
    void fizzBuzzNumber() {
        int number = 15;
        String expected = FIZZBUZZ;
        String result = FizzBuzzNumber.fizzBuzzNumber(number);
        assertEquals(expected,result);
    }

}