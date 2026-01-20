import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        // to-do: implement the method
        // keep n*2 in mind,

        int[] testSequence1 = new int[n];
        int[] testSequence2 = new int[n];

        for (int i = 0; i < n; i++) {
            testSequence1[i] = nums[i];
        }

        for (int i = nums.length - n; i < nums.length - 1; i++) {
            testSequence2[i] = nums[i];
        }
        if (testSequence1 == testSequence2) {
            return true;
        }
        return false;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        // to-do: implement the method
        int consecutiveCounterOdd = 0;
        int consecutiveCounterEven = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 == 0) {
                consecutiveCounterEven++;
                if (nums[i] % 2 != 0) {
                    consecutiveCounterEven = 0;
                }
            } else if (nums[i] % 2 != 0) {
                consecutiveCounterOdd++;
                if (nums[i] % 2 == 0) {
                    consecutiveCounterOdd = 0;
                }
            }
            if (consecutiveCounterEven >= 3 || consecutiveCounterOdd >= 3) {
                break;
            }
        }

        if (consecutiveCounterEven >= 3 || consecutiveCounterOdd >= 3) {
            return true;
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        // to-do: implement the method

        int lengthStart2End = end - start;
        int[] arrayToBeFilled = new int[lengthStart2End];
        for (int i = 0; i < lengthStart2End; i++) {
            for (int k = start; k < end; k++) {
                arrayToBeFilled[i] = k;
            }
        }

        return arrayToBeFilled;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        // to-do: implement the method
        int lengthStart2End = end - start;
        String[] arrayToFB = new String[lengthStart2End];
        for (int i = 0; i < lengthStart2End; i++) {
            for (int k = start; k < end; k++) {
                if (k % 3 == 0) {
                    arrayToFB[i] = "Fizz";
                } else if (k % 5 == 0) {
                } else if (k % 3 == 0 && i % 5 == 0) {
                    arrayToFB[i] = "FizzBuzz";
                } else {
                    arrayToFB[i] = "" + k;
                }
            }
        }
        return new String[0];
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        // to-do: implement the method
        int[] rearrangedNums = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 == 0) {

            }
        }
        return new int[0];
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}
