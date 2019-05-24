//package JewelsAndStones;
//
//import java.util.Timer;
//
//public class JewelsAndStones {
//
//    public JewelsAndStones() {
//
//        //J denotes the Jewels
//        String J = "aA";
//
//        //S denotes the stones you have in your possession
//        String S = "aAAbbbb";
//
//
//        /* Requirements:
//         * Out of the stones you have in your possession, return (as an integer) the number of Jewels you have.
//         */
//        int result = numJewelsInStones(J, S);
//        System.out.println("Result: " + result);
//    }
//
//
//    public int numJewelsInStones(String currentJewels, String currentStones) {
//        if (currentJewels.length() == 0 || currentStones.length() == 0) {
//            return 0;
//        }
//
//        long startTime = System.nanoTime();
//        int count = 0;
//        for (int i = 0; i < currentStones.length(); i++) {
//
//            char temp = currentStones.charAt(i);
//
//            if (currentJewels.contains(temp)) {
//                count++;
//            }
//        }
//
//        long endTime   = System.nanoTime();
//        long totalTime = endTime - startTime;
//        System.out.println("Total Time: " + totalTime);
//
//        // #1 443530
//        // #2 552562
//        // #3 475411
//
//        return count;
//    }
//
//    public static void main(String args[]) {
//        new JewelsAndStones();
//    }
//}
