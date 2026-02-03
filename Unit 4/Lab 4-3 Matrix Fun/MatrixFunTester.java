public class MatrixFunTester {
    public static void main(String[] args) {

        int[][] replacer = new int[2][2];
        MatrixFun testMatrix1 = new MatrixFun(4, 4);
        MatrixFun testMatrix2 = new MatrixFun(new int[][] { { 2, 3, 4 },
                { 5, 6, 7 }, { 2, 3, 4 } });
        MatrixFun testMatrix3 = new MatrixFun();
        MatrixFun defNewMatrix = new MatrixFun(new int[][] { { 2, 3, 4 },
                { 5, 6, 7 }, { 2, 3, 4 } });

        System.out.println(testMatrix1.getMatrix());
        System.out.println(testMatrix2.getMatrix());
        System.out.println(testMatrix3.getMatrix());

        testMatrix1.setMatrix(replacer);

        System.out.println(testMatrix1.getMatrix());

        System.out.println(testMatrix1.toString());
        System.out.println(testMatrix2.toString());

        System.out.println(testMatrix2.equals(testMatrix3.getMatrix()));
        System.out.println(testMatrix2.equals(defNewMatrix.getMatrix()));

        testMatrix2.replaceAll(2, 16);

        System.out.println(testMatrix2.getMatrix());

        testMatrix3.swapRow(0, 2);

        System.out.println(testMatrix3.getMatrix());
    }
}