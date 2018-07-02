package ValidParentheses;

import java.util.Stack;

public class ValidParentheses {

    public ValidParenthesesInput[] getInput() {

        ValidParenthesesInput test[] = {
                new ValidParenthesesInput("(())", true),
                new ValidParenthesesInput("()()", true),
        };

        return test;
    }

    public void validate() {
        ValidParenthesesInput getInput[] = getInput();
        for(int i = 0; i < getInput.length; i++) {
            String input = getInput[i].input;
            if(isValid(getInput[i].input) != getInput[i].isValid) {
                System.out.println("THERE WAS A PROBLEM");
                System.out.println(input);
            }
        }
        System.out.println("TEST PASSED");
    }

    public final char open_parenthesis = '(';
    public final char close_parenthesis =')';
    public int parenthesis_count;


    public boolean isValid(String input) {
        parenthesis_count = 0;
        char inputElements[] = input.toCharArray();

        for(int i = 0; i < inputElements.length; i++) {
            char temp = inputElements[i];
            if(temp == open_parenthesis) {
                parenthesis_count += 1;
            } else if(temp == close_parenthesis) {
                parenthesis_count -= 1;
            }
        }
        return parenthesis_count == 0;
    }


    public static void main(String[] args) {
        new ValidParentheses().validate();
    }

    class ValidParenthesesInput {

        public String input;
        public boolean isValid;

        public ValidParenthesesInput(String input, boolean isValid) {
            this.input = input;
            this.isValid = isValid;
        }
    }
}
