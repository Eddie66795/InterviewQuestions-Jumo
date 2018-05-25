package ReverseInt;

public class ReverseInteger {

    public ReverseInteger() {
        int testInput = -123;
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
            result = result * -1;
        }
        return result;
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
