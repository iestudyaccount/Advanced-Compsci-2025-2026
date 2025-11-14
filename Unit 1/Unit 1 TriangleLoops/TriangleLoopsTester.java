public class TriangleLoopsTester {
    public static void main(String[] args) {

        System.out.println(TriangleLoops.createLetterTriangleUp(4, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleUp(9, 'U'));
        System.out.println(TriangleLoops.createLetterTriangleUp(-3, 'B'));

        System.out.println(TriangleLoops.createLetterTriangleDown(6, 'C'));
        System.out.println(TriangleLoops.createLetterTriangleDown(10, 't'));
        System.out.println(TriangleLoops.createLetterTriangleDown(-9, 'D'));

        System.out.println(TriangleLoops.createNumbersTriangle(9));
        System.out.println(TriangleLoops.createNumbersTriangle(18));
        System.out.println(TriangleLoops.createNumbersTriangle(-23));

        System.out.println(TriangleLoops.createAlphabetTriangle(15));
        System.out.println(TriangleLoops.createAlphabetTriangle(4));
        System.out.println(TriangleLoops.createAlphabetTriangle(28));
    }
}
