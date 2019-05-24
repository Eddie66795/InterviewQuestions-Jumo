package Atoi;

public class StringToInteger {

    public int CHAR_PLUS = (int) ('+');
    public int CHAR_MINUS = (int) ('-');
    public int CHAR_MIN = (int) ('0');
    public int CHAR_MAX = (int) ('9');


    public void testLogic() {
        TestCases testCases[] = {
//                new TestCases("www123", 0),
//                new TestCases("  123", 123),
//                new TestCases("  -41", -41),
//                new TestCases("  -e3211", 0),
//                new TestCases("  -3211", -3211),
                new TestCases("  _ -1234", 0),
//                new TestCases("  +1", 1),
//                new TestCases("4193 with words", 4193),
//                new TestCases("4193noSpacesFlound", 4193),
//                new TestCases("1l2l3l", 123),
//                new TestCases("this 33 with words", 0)
        };


        for (int i = 0; i < testCases.length; i++) {
            long expectedResult = testCases[i].result;
            int actualResult = myAtoi(testCases[i].input);

            if (expectedResult != actualResult) {
                System.out.println("--------------");
                System.out.println("NOT EQUAL");
                System.out.println("--------------");
                System.out.println("Input: " + testCases[i].input);
                System.out.println("Expected: " + expectedResult);
                System.out.println("Actual  : " + actualResult);
                System.out.println("");
            }
        }
        System.out.println("END");
    }

    public boolean isAllowedChar(String inputString, int inputChar, int position) {
        if (position == 0 && (inputChar == CHAR_MINUS || inputChar == CHAR_PLUS)) {
            int nextChar = (int) inputString.toCharArray()[position + 1];
            return (nextChar >= CHAR_MIN && nextChar <= CHAR_MAX);
        } else {
            return (inputChar >= CHAR_MIN && inputChar <= CHAR_MAX);
        }
    }

    public int myAtoi(String input) {
        input = input.replaceAll("\\s+", "");
        if (isValid(input)) {
            if (input.charAt(0) == '-') {
                return -1 * myAtoi(input.substring(1, input.length()), true);
            } else {
                return myAtoi(input, false);
            }
        } else {
            return 0;
        }
    }

    public boolean isValid(String input) {


        System.out.println("_ : " +(int) input.charAt(0));
        System.out.println("a : " +(int) 'a');
        System.out.println("z : " +(int) 'z');


//        if ((int) input.charAt(0) <= (int) 'z' && (int) input.charAt(0) >= (int) 'a') {


        if ((int) input.charAt(0) <= (int) 'z' && (int) input.charAt(0) >= (int) 'a') {

            System.out.println("Hello");

            return false;
        } else {
            System.out.println("FAILEEEEE");
        }

        if (input.charAt(0) == '-' && input.length() > 2) {
            if ((int) input.charAt(1) <= (int) 'z' && (int) input.charAt(1) >= (int) 'a') {
                return false;
            }
        }
        return true;
    }


    public int myAtoi(String str, boolean isNegative) {
        long counter = 0;
        int base_value = 48;

        for (Character i : str.toCharArray()) {


            counter = ((int) i - base_value) + counter * 10;
            if (isNegative && ((counter * -1) <= Integer.MIN_VALUE)) {
                return Integer.MIN_VALUE;
            } else if (counter >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        return (int) counter;
    }


    public static void main(String[] args) {
        new StringToInteger().testLogic();
    }

    class TestCases {

        public String input;
        public long result;

        public TestCases(String input, long result) {
            this.input = input;
            this.result = result;
        }
    }
}
