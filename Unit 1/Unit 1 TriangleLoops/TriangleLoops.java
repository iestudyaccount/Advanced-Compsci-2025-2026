public class TriangleLoops {
    public static void main(String[] args) {
        // to-do: create a separate tester class
        // to-do: invoke each method at least 2 times in the tester class

        // for example:
        System.out.println(createLetterTriangleUp(3, 'A'));
        System.out.println(createLetterTriangleUp(15, 'B'));

    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the row number. The total number of rows printed
     * is determined by numberOfRows.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @param letter the letter to be printed
     * 
     * @return a String of letters in the shape of a triangle
     */

    // to-do: implement createLetterTriangleUp
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";
        int j;
        for (j = 0; j <= numberOfRows; j++) {
            triangle = triangle + letter;
            triangle = triangle + "\n";
            for (int i = 0; i <= j; i++) {
                triangle = triangle + letter;
            }
        }
        triangle = triangle + letter;
        return triangle;
    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the total number of rows, descending downward. The
     * total number of rows printed is determined by numberOfRows.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @param letter the letter to be printed
     * 
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";
        int j;
        for (j = numberOfRows; j >= 0; j--) {
            for (int i = 1; i <= j; i++) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * This method returns a String of a number triangle. The number of rows in the
     * triangle is determined by the numberOfRows, and the number used in each row
     * is determined by the row number.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
    public static String createNumbersTriangle(int numberOfRows) {

        String triangle = "";
        int j;
        for (j = 0; j <= numberOfRows; j++) {
            for (int i = 1; i <= j; i++) {
                triangle = triangle + j;
            }
            triangle = triangle + "\n";
        }

        return triangle;
    }

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet.
     * The method determines the height of the pyramid by using the int
     * numberOfRows.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        if (numberOfRows > 26) {
            numberOfRows = 26;
        }

        String triangle = "";
        for (int row = 0; row < numberOfRows; row++) {
            for (int coulmn = numberOfRows; coulmn > row; coulmn--) {
                // spaces
                triangle = triangle + " ";
            }
            for (char letter = 'A'; letter <= 'A' + row; letter++) {
                // descending
                triangle = triangle + letter;
            }
            for (char backwards = (char) ('A' + row - 1); backwards >= 'A'; backwards--) {
                // ascending
                triangle = triangle + backwards;
            }
            triangle = triangle + "\n";
        }

        return triangle;
    }

    // right side a + b (+ c.. + d..), left side a + ba ( + cba.. + ...)

}