public class ArrayOps {

    /**
     * Prints the contents of a string array, separating each element with a
     * comma and enclosing the output in square brackets [].
     *
     * @param array
     *              The String array to be printed.
     * @return The constructed string representation of the array.
     */
    public static String printStringArray(String[] array) {
        String printArray = "";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                printArray += array[i] + ", ";
            }

            if (i == array.length - 1) {
                printArray += array[i];
            }
        }

        String printArrayWithBrackets = "[" + printArray + "]";

        System.out.println(printArrayWithBrackets);
        return printArrayWithBrackets;
    }

    /**
     * Prints the contents of an int array, separating each element with a comma and
     * enclosing the output in square brackets [].
     *
     * @param array
     *              The int array to be printed.
     * @return The String representation of the array.
     */

    public static String printIntegerArray(int[] array) {
        String intArray = "";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                intArray += array[i] + ", ";
            }

            if (i == array.length - 1) {
                intArray += array[i];
            }
        }

        String intArrayWithBrackets = "[" + intArray + "]";
        System.out.println(intArrayWithBrackets);
        return intArrayWithBrackets;
    }

    /**
     * The method finds the largest integer in the array.
     *
     * @param array
     *              The int array to find the maximum value from.
     * @return The largest integer in the array.
     */
    public static int findMax(int[] array) {
        int maxInArray = array[0];
        for (int i = 0; i < array.length; i++) {
            int tempMax = array[i];
            if (array[i] > tempMax) {
                maxInArray = array[i];
            }
        }
        System.out.println(maxInArray);
        return maxInArray;
    }

    /**
     * The method returns the longest String in the array.
     * If two Strings share the longest length, the method will return the one that
     * appears first in the array.
     *
     * @param array
     *              The String array to find the longest String from.
     * @return The longest String in the array.
     */
    public static String findLongestString(String[] array) {
        String longestString = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > longestString.length()) {
                longestString = array[i];
            }
        }
        return longestString;
    }

    /**
     * Calculates the average length of all the Strings in the array.
     *
     * @param array
     *              The String array to find the average string length from.
     * @return The average length of all the Strings in the array.
     */
    public static double averageStringLength(String[] array) {
        double average = 0.0;
        double addToBeDivided = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                addToBeDivided = addToBeDivided + array[i].length();
            }
        }

        average = addToBeDivided / array.length;
        return average;
    }

    /**
     * Counts the number of times each letter appears in the given String.
     * The method creates an array of integers length 26, where each element
     * represents the
     * frequency of a letter in the alphabet. The first element (index 0) represents
     * the frequency of the letter 'a', the second element (index 1) represents the
     * frequency of the letter 'b', and so on.
     *
     * @param input
     *              The input string to count letter frequencies from.
     * @return An int array representing the frequency of each letter in the input
     *         string.
     */
    public static int[] countLetterFrequencies(String input) {
        if (input.equals(null)) {
            return new int[0];
        }

        int[] letterMarker = new int[26];

        String fixedInput = input.toLowerCase();

        for (int i = 0; i < fixedInput.length(); i++) {
            if (fixedInput.charAt(i) == 'a') {
                letterMarker[0] += 1;
            } else if (fixedInput.charAt(i) == 'b') {
                letterMarker[1] += 1;
            } else if (fixedInput.charAt(i) == 'c') {
                letterMarker[2] += 1;
            } else if (fixedInput.charAt(i) == 'd') {
                letterMarker[3] += 1;
            } else if (fixedInput.charAt(i) == 'e') {
                letterMarker[4] += 1;
            } else if (fixedInput.charAt(i) == 'f') {
                letterMarker[5] += 1;
            } else if (fixedInput.charAt(i) == 'g') {
                letterMarker[6] += 1;
            } else if (fixedInput.charAt(i) == 'h') {
                letterMarker[7] += 1;
            } else if (fixedInput.charAt(i) == 'i') {
                letterMarker[8] += 1;
            } else if (fixedInput.charAt(i) == 'j') {
                letterMarker[9] += 1;
            } else if (fixedInput.charAt(i) == 'k') {
                letterMarker[10] += 1;
            } else if (fixedInput.charAt(i) == 'l') {
                letterMarker[11] += 1;
            } else if (fixedInput.charAt(i) == 'm') {
                letterMarker[12] += 1;
            } else if (fixedInput.charAt(i) == 'n') {
                letterMarker[13] += 1;
            } else if (fixedInput.charAt(i) == 'o') {
                letterMarker[14] += 1;
            } else if (fixedInput.charAt(i) == 'p') {
                letterMarker[15] += 1;
            } else if (fixedInput.charAt(i) == 'q') {
                letterMarker[16] += 1;
            } else if (fixedInput.charAt(i) == 'r') {
                letterMarker[17] += 1;
            } else if (fixedInput.charAt(i) == 's') {
                letterMarker[18] += 1;
            } else if (fixedInput.charAt(i) == 't') {
                letterMarker[19] += 1;
            } else if (fixedInput.charAt(i) == 'u') {
                letterMarker[20] += 1;
            } else if (fixedInput.charAt(i) == 'v') {
                letterMarker[21] += 1;
            } else if (fixedInput.charAt(i) == 'w') {
                letterMarker[22] += 1;
            } else if (fixedInput.charAt(i) == 'x') {
                letterMarker[23] += 1;
            } else if (fixedInput.charAt(i) == 'y') {
                letterMarker[24] += 1;
            } else if (fixedInput.charAt(i) == 'z') {
                letterMarker[25] += 1;
            }
        }

        return letterMarker;
    }

    /**
     * Removes the indicated element, shifts the index of all the elements down by
     * one, and assigns a value of zero to the last element in the array.
     *
     * @param array
     *              The array of int values
     * @param index
     *              The index of the element to be removed
     * @return The updated array
     */
    public static int[] removeIntAndScoot(int[] array, int index) {

        int[] scootedArray = new int[];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {

            }
        }

        return new int[0];
    }

    /**
     * Resizes the input array to twice its size.
     *
     * @param array
     *              The input array of integers
     * @return The resized array
     */
    public static int[] resizeIntArray(int[] array) {
        int arraySize = array.length;
        int[] doubledSize = new int[arraySize * 2];

        return new doubledSize;
    }

    /**
     * Adds the number symbol (#) and the element number (index) to the beginning of
     * each
     * String in the array.
     * For example, if the array contained: {"Hello", "my", "name", "is", "Larry"},
     * then this method would return an array with the contents:
     * {"#0 Hello", "#1 my", "#2 name", "#3 is", "#4 Larry"}.
     *
     * @param array
     *              The array of Strings to modify
     * @return The modified array with the number symbol and element number added to
     *         each String
     */
    public static String[] addNumToStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 

        }
        return new String[0];
    }

    /**
     * Reverses the order of the elements in the given integer array.
     *
     * @param array
     *              The array to be reversed
     * @return The reversed array
     */
    public static int[] reverseIntArray(int[] array) {
        return new int[0];
    }

}
