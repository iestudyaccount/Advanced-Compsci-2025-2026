public class Unit3ExercisesTester {
    public static void main(String[] args) {

        // names average length methods
        testExampleNames1();
        testExampleNames2();
        testExampleNames3();

        // reversible string methods
        testReversibleString1();
        testReversibleString2();
        testReversibleString3();
        testReversibleString4();

        // Max Values

        testMaxValue1();
        testMaxValue2();
        testMaxValue3();
        testMaxValue4();

        // Palindromes

        testPalindrome1();
        testPalindrome2();
        testPalindrome3();
        testPalindrome4();

        // Sum Evens

        testSumEvens1();
        testSumEvens2();
        testSumEvens3();
        testSumEvens4();

        // Part 2 Testers

        // Sum of Squares

        testSumOfSquares1();
        testSumOfSquares2();

        // Nth Fibonnaci

        testNthFibonnaci1();
        testNthFibonnaci2();

        // Descending Order

        testDescending1();
        testDescending2();
        testDescending3();

        // Part 3 Testers

        // Parse Pos Int

        testPosInt1();
        testPosInt2();

        // Index-Specific Element

        testGetElement1();
        testGetElement2();

        // Square Root of Number

        testSqrt1();
        testSqrt2();

        // power of (x)

        testCalcPower1();
        testCalcPower2();
    }

    // array printer
    public static String stringArrayPrinter(String[] test) {
        String stringArray = "";
        for (int i = 0; i < test.length - 1; i++) {
            if (i != test.length - 1) {
                stringArray += test[i] + ", ";
            } else {
                stringArray += test[i];
            }
        }
        return stringArray;
    }

    public static String intArrayPrinter(int[] test) {
        if (test == null) {
            return null;
        }

        String intArray = "[";
        for (int i = 0; i < test.length; i++) {
            intArray += test[i];
            if (i < test.length - 1) {
                intArray += ", ";
            }

        }
        intArray += "]";
        return intArray;
    }

    public static void testExampleNames1() {
        String[] names = { "lol" };
        System.out.println(Unit3Exercises.calculateAverageStringLength(names));
    }

    public static void testExampleNames2() {
        String[] oddNames = { "lol", "Jim", null, "John Microsoft", "Elmo" };
        System.out.println(Unit3Exercises.calculateAverageStringLength(oddNames));
    }

    public static void testExampleNames3() {
        String[] odderNames = null;
        System.out.println(Unit3Exercises.calculateAverageStringLength(odderNames));
    }

    public static void testReversibleString1() {
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
    }

    public static void testReversibleString2() {
        // Test Case - Edge Case: String with spaces at the end and in the middle
        String testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
    }

    public static void testReversibleString3() {
        String testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
    }

    public static void testReversibleString4() {
        // Test Case - Edge Case: Null string
        try {
            String testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testMaxValue1() {
        int[] testArray = { 3, -5, 6, -8, 9 };
        System.out.println("Expected 9: " + Unit3Exercises.findMaxValue(testArray));
    }

    public static void testMaxValue2() {
        int[] testArray = { 3, -5, 6, -8, 9 };
        System.out.println("Expected 9: " + Unit3Exercises.findMaxValue(testArray));
    }

    public static void testMaxValue3() {
        int[] testArray = { -3, -5, -6, -8, -9 };
        System.out.println("Expected -3: " + Unit3Exercises.findMaxValue(testArray));
    }

    public static void testMaxValue4() {
        int[] testArray = null;
        System.out.println("Expected 0: " + Unit3Exercises.findMaxValue(testArray));
    }

    public static void testPalindrome1() {
        String testString = "deed";
        System.out.println("Expected 'deed': " + Unit3Exercises.isPalindrome(testString));
    }

    public static void testPalindrome2() {
        String testString = "elmo";
        System.out.println("Expected 'omle': " + Unit3Exercises.isPalindrome(testString));
    }

    public static void testPalindrome3() {
        String testString = null;
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(testString));
    }

    public static void testPalindrome4() {
        String testString = "";
        System.out.println("Expected '': " + Unit3Exercises.isPalindrome(testString));
    }

    public static void testSumEvens1() {
        int[] testArray = { 3, 5, 6, 8, 9 };
        System.out.println("Expected 14: " + Unit3Exercises.sumEvenNumbers(testArray));
    }

    public static void testSumEvens2() {
        int[] testArray = { -3, -5, -6, -8, -9 };
        System.out.println("Expected -14: " + Unit3Exercises.sumEvenNumbers(testArray));
    }

    public static void testSumEvens3() {
        int[] testArray = { 3, -5, 6, -8, 9 };
        System.out.println("Expected -2: " + Unit3Exercises.sumEvenNumbers(testArray));
    }

    public static void testSumEvens4() {
        int[] testArray = null;
        System.out.println("Expected 0: " + Unit3Exercises.sumEvenNumbers(testArray));
    }

    // Part 2 Testers

    // sum of squares

    public static void testSumOfSquares1() {

        int[] testArray = { 2, 5, 7, 3, 4 };
        System.out.println("Expected 103: " + Unit3Exercises.calculateSumOfSquares(testArray));

    }

    public static void testSumOfSquares2() {
        // placeholder value for testing
        int[] testArray = null;
        System.out.println(
                "Expected \"No! BAD INPUT!! SPRAY BOTTLE!!!\": " + Unit3Exercises.calculateSumOfSquares(testArray));
    }

    // nth fibonnaci

    public static void testNthFibonnaci1() {
        int testInt = 6;
        System.out.println("Expected 8: " + Unit3Exercises.getNthFibonacci(testInt));
    }

    public static void testNthFibonnaci2() {
        // placeholder value for testing
        int testInt = -11;
        System.out
                .println("Expected \"No! BAD INPUT!! SPRAY BOTTLE!!!\"\": " + Unit3Exercises.getNthFibonacci(testInt));
    }

    // sort array in descending order

    public static void testDescending1() {
        int[] testArray = { 5, 3, 7, 1, 10 };
        int[] resultArray = Unit3Exercises.sortArrayDescending(testArray);
        System.out.println("Expected [10, 7, 5, 3, 1]: " + intArrayPrinter(resultArray));
    }

    public static void testDescending2() {
        int[] testArray = { -5, -3, -7, -1, -10 };
        int[] resultArray = Unit3Exercises.sortArrayDescending(testArray);
        System.out.println("Expected [-1, -3, -5, -7, -10]: " + intArrayPrinter(resultArray));
    }

    public static void testDescending3() {
        int[] testArray = null;
        System.out.println(
                "Expected \"No! BAD INPUT!! SPRAY BOTTLE!!!\": " + Unit3Exercises.sortArrayDescending(testArray));

    }

    // Day 3 Testers

    // Parse Positive Integers

    public static void testPosInt1() {
        String testString = "4";
        try {
            System.out.println("Expected 4: " + Unit3Exercises.parsePositiveInteger(testString));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testPosInt2() {
        String testString = "-4";
        try {
            System.out.println("Expected 4: " + Unit3Exercises.parsePositiveInteger(testString));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Get Index Element

    public static void testGetElement1() {
        int index = 2;
        String[] array = { "russelbuck", "boa", "the cranberries", "alex g" };
        System.out.println("Expected \"the cranberries\": " + Unit3Exercises.getArrayElement(array, index));
    }

    public static void testGetElement2() {
        int index = -2;
        String[] array = { "russelbuck", "boa", "the cranberries", "alex g" };
        System.out.println("Expected null: " + Unit3Exercises.getArrayElement(array, index));
    }

    // Square Root of Number

    public static void testSqrt1() {
        int number = 16;
        System.out.println("Expected 4: " + Unit3Exercises.calculateSquareRoot(number));
    }

    public static void testSqrt2() {
        int number = -6;
        System.out.println("Expected 4: " + Unit3Exercises.calculateSquareRoot(number));
    }

    //

    public static void testAddElements1() {
        int[] testArray = { 3, 5, 6, 3, 2 };
        System.out.println("Expected 19:" + Unit3Exercises.sumArrayElements(testArray));

    }

    public static void testAddElements2() {
        int[] testArray = null;
        System.out.println("Expected null" + Unit3Exercises.sumArrayElements(testArray));
    }

    // Power of a Base

    public static void testCalcPower1() {
        double testDouble = 2.5;
        int testInt = 2;
        System.out.println("Expected 6.25: " + Unit3Exercises.calculatePower(testDouble, testInt));
    }

    public static void testCalcPower2() {
        double testDouble = 2.5;
        int testInt = -2;
        System.out.println("Expected null: " + Unit3Exercises.calculatePower(testDouble, testInt));
    }
}
