package PalindromeNumber;

public class IsPalindromeNumber {

    public TestInput[] getTestInput() {
        TestInput testInput[] = {
                new TestInput(1, true),
                new TestInput(2442, true),
                new TestInput(-1, false),
                new TestInput(991799, false),
                new TestInput(991799, false),
                new TestInput(1, true)
        };
        return testInput;
    }

    public void runClassTests() {
        TestInput testInput[] = getTestInput();

        for (int i = 0; i < testInput.length; i++) {
            boolean actualResult = isPalindrome(testInput[i].input);
            boolean expectedResult = testInput[i].result;

            if (actualResult != expectedResult) {
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
        if (x < 0) {
            return false;
        }
        if (x / 10 == 0) {
            return true;
        }

        char array[] = Integer.toString(x).toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            int frontCount = i;
            int backCount = array.length - 1 - i;

            if (array[frontCount] != array[backCount]) {
                return false;
            } else if (frontCount == backCount) {
                return true;
            }
        }
        return true;
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
