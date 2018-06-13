package ValidParentheses;

import java.util.*;

public class ValidParentheses {

    private final char PARENTHESIS_OPEN = '(';
    private final char PARENTHESIS_CLOSE= ')';
    private final char BRACKET_OPEN = '{';
    private final char BRACKET_CLOSE = '}';
    private final char BRACE_OPEN = '[';
    private final char BRACE_CLOSE = ']';

    public ValidParentheses() {
        TestInput testInput[] = {
                new TestInput("(())", true),
                new TestInput("([]){}", true),
        };


        for(int i = 0; i < testInput.length; i++) {
            String temp = testInput[i].input;
            boolean result = isValid(testInput[i].input);
            System.out.println("Actual: " + result);
            System.out.println("Expected: " + testInput[i].isValid);
        }
    }



    public boolean isValid(String input) {
        char inputChars[] = input.toCharArray();
        int count = 0;

        Stack st = new Stack();

        for(int i = 0; i < inputChars.length - 1; i++) {
            if(isValidChar(inputChars[i])) {
                if(isOpen(inputChars[i])) {
                    count ++;
                    st.push(inputChars[i]);
                } else if (isClosed(inputChars[i])) {
                    count --;
                }
            } else {
                return false;
            }
        }
        return (count == 0);
    }

    public char opposites(char inputChar) {
        switch (inputChar) {
            case PARENTHESIS_OPEN:
                return PARENTHESIS_CLOSE;
            case BRACKET_OPEN:
                return BRACKET_CLOSE;
            case BRACE_OPEN:
                return BRACE_CLOSE;
        }
        return inputChar;
    }


    public boolean isOpen(char inputChar) {
        switch (inputChar) {
            case PARENTHESIS_OPEN:
                return true;
            case BRACKET_OPEN:
                return true;
            case BRACE_OPEN:
                return true;
            default: return false;
        }
    }

    public boolean isClosed(char inputChar) {
        switch (inputChar) {
            case PARENTHESIS_CLOSE:
                return true;
            case BRACKET_CLOSE:
                return true;
            case BRACE_CLOSE:
                return true;
            default: return false;
        }
    }

    public boolean isValidChar(char inputChar) {
        switch (inputChar) {
            case PARENTHESIS_OPEN:
                return true;
            case PARENTHESIS_CLOSE:
                return true;
            case BRACKET_OPEN:
                return true;
            case BRACKET_CLOSE:
                return true;
            case BRACE_OPEN:
                return true;
            case BRACE_CLOSE:
                return true;
            default:
                return false;
        }
    }




    public static void main(String[] args) {
        new ValidParentheses();
    }

    class TestInput {

        public String input;
        public boolean isValid;

        public TestInput(String input, boolean isValid) {
            this.input = input;
            this.isValid = isValid;
        }
    }

}
