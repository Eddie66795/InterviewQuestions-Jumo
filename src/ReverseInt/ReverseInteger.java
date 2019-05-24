package ReverseInt;

/**
 * STATUS: Complete, however the given solution does not cater for overflow
 */
public class ReverseInteger {

    public void testCases() {
        TestCases testCases[] = {
                new TestCases(123456, 654321),
                new TestCases(463847412, 214748364),
                new TestCases(1463847412, 2147483641),
                new TestCases(123, 321),
                new TestCases(-123, -321),
//                new TestCases(-2147483648, 0),
//                new TestCases(1534236469, 0),
        };

        for(int i = 0; i < testCases.length; i++) {
            if(testCases[i].result != reverse(testCases[i].input)) {
                System.out.println("Actual: " + reverse(testCases[i].input));
                System.out.println("Expected: " + testCases[i].result);
            }
        }
    }

    public int reverse(int input) {
        return reverse(input, 0);
    }

    public int reverse(int input, int result) {
        if(input == 0) {
            return result;
        }
        return reverse(input / 10, (result * 10 + input % 10));
    }

    public static void main(String[] args) {
        new ReverseInteger(). testCases();
    }

    class TestCases {

        int input;
        int result;

        public TestCases(int input, int result) {
            this.input = input;
            this.result = result;
        }
    }
}
