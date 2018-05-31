package ReverseInt;

public class ReverseInteger {

    public int ORIGINAL;

    public void testCases() {

        TestCases testCases[] = {
                new TestCases(-2147483648, 0),
                new TestCases(463847412, 214748364),
                new TestCases(1463847412, 2147483641),
                new TestCases(1534236469, 0),
                new TestCases(123, 321),
                new TestCases(-123, -321),
        };

        for(int i = 0; i < testCases.length; i++) {
            int input = testCases[i].input;
            ORIGINAL = input;
            int expectedResult = testCases[i].result;
            int actualResult = reverse(input);

            if(expectedResult != actualResult) {
                System.out.println("-------------");
                System.out.println("NOT EQUAL: ");
                System.out.println("-------------");
                System.out.println("Input: " + input);
                System.out.println("Actual: " + actualResult);
                System.out.println("Expected: " + expectedResult);
                System.out.println();
            }
        }
        System.out.println("Test END");
    }


    public boolean hasError(int result, int input) {
        if(result <= Integer.MIN_VALUE || result >= Integer.MAX_VALUE) {
            return true;
        } else if(input >= -10 || input <= 10) {
             if(input > 0 && input <= 10) {
                return (result > (Integer.MAX_VALUE / 10));
            } else if(input < 0 && input >= -10) {
                return (result < (Integer.MIN_VALUE / 10));
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int reverse(int input) {
        return reverse(input, 0);
    }

    public int reverse(int input, int result) {
        if(input == 0) {
            return result;
        } else {
            if(hasError(result, input) ) {
                return 0;
            } else {
                int k = result * 10 + input % 10;
                return reverse(input / 10, k);
            }
        }
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
