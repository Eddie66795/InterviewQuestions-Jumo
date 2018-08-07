package ValidParentheses;

public class InputHelper {

    public final Character OPEN_P = '(';
    public final Character CLOSE_P = ')';

    public final Character OPEN_B = '{';
    public final Character CLOSE_B = '}';

    public final Character OPEN_BR = '[';
    public final Character CLOSE_BR = ']';

    public Character getOpposite(Character inputChar) {
        if(inputChar == CLOSE_P) {
            return OPEN_P;
        } else if(inputChar == CLOSE_B) {
            return OPEN_B;
        } else {
            return OPEN_BR;
        }
    }

    public boolean isOpen(Character input) {
        if(input == OPEN_B || input == OPEN_BR || input == OPEN_P) {
            return true;
        }
        return false;
    }

    public boolean isClosed(Character input) {
        if(input == CLOSE_B || input == CLOSE_BR || input == CLOSE_P) {
            return true;
        }
        return false;
    }

}
