package ReverseInt;

public class ReverseInteger {

    public ReverseInteger() {
        int testInput = -1234;
        int result = reverse(testInput, false);

        System.out.println("Result: " + result);
    }

    public int reverse(int input, boolean isNegative) {
        if(input < 0) {
            isNegative = true;
            input = input * -1;
        }
        int result = reverse(input, 0);
        if(isNegative) {
            System.out.println("isNegative: ");
            result = result;
            System.out.println("isNegative: " + result);
            return result;
        } else {
            System.out.println("isNotNegative: ");
            return result;
        }
    }

    public int reverse(int input, int result) {
        if(input < 10) {
            return (result * 10 + input);
        }

        int k = result * 10 + input % 10;
        return reverse(input/10, k);
    }

    public static void main(String[] args) {
        new ReverseInteger();
    }
}
