package toLowerCase;

public class toLowerCase {

    final char UPPER_A = 'A';
    final char UPPER_Z = 'Z';

    final char LOWER_A = 'a';
    final char LOWER_Z = 'z';

    public int convesion_difference() {
        return (int)UPPER_A - (int)UPPER_Z;
    }


    public toLowerCase() {
        System.out.println("Hello");
        toLowerCase("ll");
    }

    public boolean isValidChar(char input) {
        int numerical_value = (int)input;

        return (2 <  numerical_value < 3);


    }

    public String toLowerCase(String input) {


        System.out.println("a:" + (int)'a');
        System.out.println("A:" + (int)'A');
        System.out.println();

        System.out.println("z:" + (int)'z');
        System.out.println("Z:" + (int)'Z');



        return "";
    }

    public static void main(String[] args) {
        new toLowerCase();
    }
}
