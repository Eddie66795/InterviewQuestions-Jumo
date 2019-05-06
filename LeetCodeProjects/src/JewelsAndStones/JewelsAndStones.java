package JewelsAndStones;

public class JewelsAndStones {

    public JewelsAndStones() {

        //J denotes the Jewels
        String J = "aA";

        //S denotes the stones you have in your possession
        String S = "aAAbbbb";


        /* Requirements:
         * Out of the stones you have in your possession, return (as an integer) the number of Jewels you have.
         */
        int result = numJewelsInStones(J, S);
        System.out.println("Result: " + result);
    }


    public int numJewelsInStones(String currentJewels, String currentStones) {
        if (currentJewels.length() == 0 || currentStones.length() == 0) {
            return 0;
        }

        int count = 0;
        for (Character i : currentStones.toCharArray()) {
            if (currentJewels.contains(i.toString())) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        new JewelsAndStones();
    }
}
