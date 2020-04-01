public class FizzBuzzNumber {

    public static final String FIZZBUZZ = "FIZZBUZZ";
    public static final String FIZZ = "FIZZ";
    public static final String BUZZ = "BUZZ";

    public static String fizzBuzzNumber(int number) {
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        if (isDivisibleBy3 && isDivisibleBy5) {
            return FIZZBUZZ;
        }
        else if (isDivisibleBy3) {
            return FIZZ;
        }
        else if (isDivisibleBy5) {
            return BUZZ;
        }
        return "";
    }
}
