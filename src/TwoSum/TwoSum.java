package TwoSum;

import java.util.ArrayList;

public class TwoSum {

    public TwoSum() {
        int inputNumbers[] = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(inputNumbers, target);
        for(Integer i: result) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] inputNumbers, int target) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i = 0; i < inputNumbers.length; i++) {
            for(int j = i + 1; j < inputNumbers.length; j++) {
                if(j < inputNumbers.length) {
                    if((inputNumbers[i] + inputNumbers[j] == target)) {
                        results.add(i);
                        results.add(j);
                    }
                }
            }
        }
        return toIntArray(results);
    }

    public int[] toIntArray(ArrayList<Integer> results) {
        int arr[] = new int[results.size()];
        for(int i = 0; i < results.size(); i++) {
            arr[i] = results.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        new TwoSum();
    }
}
