public class Unit4ExercisesTester {
    public static void main(String[] args) {

        int[] testArray1 = { 1, 2, 5, 6, 7, 9, 6, 1, 2 };
        int[] testArray2 = { 2, 4, 6, 8 };
        int[] testArray3 = { 3, 5, 7, 3, 8 };
        int[] testArray4 = null;

        // match @ end
        System.out.println("Expected true: " + Unit4Exercises.matchingEndSequences(testArray1, 2));
        System.out.println("Expected false: " + Unit4Exercises.matchingEndSequences(testArray1, 4));

        // Count 3 consecutively

        System.out.println("Expected true: " + Unit4Exercises.hasThreeConsecutive(testArray2));
        System.out.println("Expected true: " + Unit4Exercises.hasThreeConsecutive(testArray3));
        System.out.println("Expected false: " + Unit4Exercises.hasThreeConsecutive(testArray1));

        // Generate # sequence

        System.out.println(
                "Expected [2, 3, 4, 5]: "
                        + Unit4Exercises.printIntArray(Unit4Exercises.generateNumberSequence(2, 6)));

        // fizzBuzzin' it

        System.out.println("Expected [Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz,"
                + " 11, Fizz, 13, 14, FizzBuzz]:"
                + Unit4Exercises.printStringArray(Unit4Exercises.fizzBuzz(3, 16)));
        System.out.println("Expected [Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]: "
                + Unit4Exercises.printStringArray(Unit4Exercises.fizzBuzz(5, 16)));

        // Even < Odd

        System.out.println("Expected [8, 3, 5, 7, 3]: "
                + Unit4Exercises.printIntArray(Unit4Exercises.moveEvenBeforeOdd(testArray3)));
        System.out.println("Expected null: " + Unit4Exercises.moveEvenBeforeOdd(testArray4));

    }
}
