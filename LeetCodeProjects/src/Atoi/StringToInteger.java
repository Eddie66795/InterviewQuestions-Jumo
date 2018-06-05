package Atoi;

public class StringToInteger {

    public int CHAR_PLUS  = (int)('+');
    public int CHAR_MINUS = (int)('-');
    public int CHAR_MIN = (int)('0');
    public int CHAR_MAX = (int)('9');


    public void testLogic() {
        TestCases testCases[] = {
                new TestCases("   123", 123),
                new TestCases("  123", 123),
                new TestCases("  -41", -41),
                new TestCases("  -e3211", 0),
                new TestCases("  -3211", -3211),
                new TestCases("  _ -1234", 0),
                new TestCases("  +1", 1),
                new TestCases("4193 with words", 4193),
                new TestCases("4193noSpacesFlound", 4193),
                new TestCases("1l2l3l", 123),
                new TestCases("this 33 with words", 0)
        };

        for(int i = 0; i < testCases.length; i++) {
            int expectedResult = testCases[i].result;
            int actualResult = myAtoi(testCases[i].input);;

            if(expectedResult != actualResult) {
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
        if(position == 0 && (inputChar == CHAR_MINUS || inputChar == CHAR_PLUS)) {
            int nextChar = (int)inputString.toCharArray()[position + 1];
            return (nextChar >= CHAR_MIN && nextChar <= CHAR_MAX);
        } else {
            return (inputChar >= CHAR_MIN && inputChar <= CHAR_MAX);
        }
    }


    public String removeNonNumericalChars(String inputString) {
        inputString = inputString.replaceAll("\\s+", "");
        char firstChar = inputString.toCharArray()[0];

        //Remove trailing + and - chars
        if(firstChar == CHAR_MINUS || firstChar == CHAR_PLUS) {
            int nextFirstChar = (int)inputString.toCharArray()[1];
            if(!(nextFirstChar >= CHAR_MIN) || !(nextFirstChar <= CHAR_MAX)) {
                return "0";
            }
        }

        int nextFirstChar = (int)inputString.charAt(0);
        if((nextFirstChar >= CHAR_MIN && nextFirstChar <= CHAR_MAX) || (firstChar == CHAR_MINUS) || (firstChar == CHAR_PLUS)) {
                //TODO NOW REMOVE ALPHA-NUMERICAL-CHARS
            StringBuilder temp = new StringBuilder();
            char intputCharArray[] = inputString.toCharArray();

            for(int i = 0; i < intputCharArray.length; i++) {
                int currentCharValue = (int)intputCharArray[i];
                if(i == 0 && (currentCharValue == CHAR_MINUS || currentCharValue == CHAR_PLUS)) {
                    temp.append(Character.toString(intputCharArray[i]));
                }
                if(currentCharValue >= CHAR_MIN && currentCharValue <= CHAR_MAX) {
                        temp.append(Character.toString(intputCharArray[i]));
                }
            }
            return temp.toString();
        } else {
            return "0";
        }

    }

    public int myAtoi(String str) {
        return Integer.parseInt(removeNonNumericalChars(str));
    }

    public static void main(String[] args) {
        new StringToInteger().testLogic();
    }

    class TestCases {

        public String input;
        public int result;

        public TestCases(String input, int result) {
            this.input = input;
            this.result = result;
        }
    }
}
