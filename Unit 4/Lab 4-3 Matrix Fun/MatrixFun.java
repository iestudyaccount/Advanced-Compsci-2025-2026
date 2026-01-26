public class MatrixFun {
    // constructors

    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfColumns) {
        this.matrix = new int[numberOfRows][numberOfColumns];
    }

    public MatrixFun(int[][] starterMatrix) {
        this.matrix = starterMatrix;
    }

    public MatrixFun() {
        this.matrix = new int[3][3];
    }

    // getters

    public int[][] getMatrix() {
        return matrix;
    }

    // setters

    public void setMatrix(int[][] newMatrix) {
        this.matrix = newMatrix;
    }

    // methods
    public String toString() {
        String printGrid = "=".repeat(3);
        for (int r = 0; r < matrix.length; r++) {
            printGrid += "\n";
            for (int c = 0; c < matrix[r].length; c++) {
                printGrid += matrix[r][c];
                if (c != matrix[r].length - 1) {
                    printGrid += " ";
                }
            }
        }
        printGrid += "\n" + "=".repeat(3);
        return printGrid;
    }

    public boolean equals(MatrixFun other) {
        if (this.toString() == other.toString()) {
            return true;
        }
        return false;
    }

    public boolean equals(int[][] other) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if()
            }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == oldValue) {
                    matrix[r][c] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        int placeHolderA = 0;
        int placeHolderB = 0;
    }

    // additonal methdods

}
