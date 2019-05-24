package MaximumSubarray;

import java.util.ArrayList;
import java.util.LinkedList;

public class MaximumSubarray {

    public static void main(String[] args) {
        new MaximumSubarray();
    }

    public MaximumSubarray() {
        LinkedList<TestData> testData = new LinkedList<TestData>();

        testData.add(new TestData(1, new int[] {-2, 1}));
        testData.add(new TestData(3, new int[] {1, 2}));
        testData.add(new TestData(6, new int[] {-2,1,-3,4,-1,2,1,-5,4}));
//        testData.add(new TestData(-1, new int[] {-1, -2}));
//        testData.add(new TestData(-1, new int[] {-1}));

        for(TestData input: testData) {
            int result = maxSubArray(input.inputData);
            if(result != input.expectedResult) {
                input.printInputData();
                System.out.println("Expected: " + input.expectedResult);
                System.out.println("Actual: " + result);
                break;
            }
        }
    }

    public int maxSubArray(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int sum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int value = nums[i];


            if(value > max) {
                max = value;
            }

            if((sum + value) > max) {
                max = sum + value;
            } else {
                sum = value;
            }

            sum += value;



        }
        return max;
    }

    class TestData {

        public int expectedResult;
        public int inputData[];

        public TestData(int expectedResult, int inputData[]) {
            this.expectedResult = expectedResult;
            this.inputData = inputData;
        }

        public void printInputData() {
            for(Integer i: inputData) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
