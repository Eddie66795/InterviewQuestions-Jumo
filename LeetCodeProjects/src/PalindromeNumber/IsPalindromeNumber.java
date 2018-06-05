package PalindromeNumber;

public class IsPalindromeNumber {

    public TestInput[] getTestInput() {
        TestInput testInput[] =  {
            new TestInput(1, true),
            new TestInput(1111, true),
            new TestInput(99199, true),
            new TestInput(991799, false),
            new TestInput(991799, false),
        };
        return testInput;
    }

    public void runClassTests() {
        TestInput testInput[] = getTestInput();

        for(int i = 0; i < testInput.length; i++) {
            boolean actualResult = isPalindrome(testInput[i].input);
            boolean expectedResult = testInput[i].result;

            if(actualResult != expectedResult) {
                System.out.println("----------------");
                System.out.println("NOT EQUAL");
                System.out.println("Input: " + testInput[i].input);
                System.out.println("actualResult: " + actualResult);
                System.out.println("expectedResult: " + expectedResult);
                System.out.println("");
            }
        }
        System.out.println("END");
    }


    public boolean isPalindrome(int x) {
        String inputString = Integer.toString(x);
        if(inputString.length() == 1) {
            return true;
        } else {

            //String has an equal number of chars
            if(inputString.length() % 2 == 0) {
                for(int i = 0; i < inputString.length(); i++) {
                    int frontCount = i;
                    int backCount = inputString.length() - i;
                }
            } else {

            }
        }
        return false;
    }



    public static void main(String[] args) {
        new IsPalindromeNumber().runClassTests();
    }

    class TestInput {

        public int input;
        public boolean result;

        public TestInput(int input, boolean result) {
            this.input = input;
            this.result = result;
        }
    }
}
