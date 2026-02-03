public class MatrixFun {
    // constructors

    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfColumns) {
        if (numberOfRows <= 0 || numberOfColumns <= 0) {
            throw new IllegalArgumentException("Dimensions can't be negative.");
        }

        this.matrix = new int[numberOfRows][numberOfColumns];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = (int) (Math.random() * 10);
            }
        }
    }

    public MatrixFun(int[][] starterMatrix) {
        this.matrix = starterMatrix;
    }

    public MatrixFun() {
        this.matrix = new int[3][3];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = (int) Math.random() * 10;
            }
        }
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
        String printGrid = "";
        if (matrix.length % 2 == 0) {
            printGrid += "=".repeat(matrix.length + 1) + "\n";
        } else {
            printGrid += "=".repeat(matrix.length + 2) + "\n";
        }
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                printGrid += matrix[r][c] + " ";
            }
            printGrid += "\n";
        }
        if (matrix.length % 2 == 0) {
            printGrid += "=".repeat(matrix.length + 1);
        } else {
            printGrid += "=".repeat(matrix.length + 2);
        }

        return printGrid;
    }

    public boolean equals(MatrixFun other) {
        int[][] compare1 = this.getMatrix();
        int[][] compare2 = other.getMatrix();
        if (compare1.length != compare2.length || compare1[0].length != compare2[0].length) {
            return false;
        }

        for (int r = 0; r < compare1.length; r++) {
            for (int c = 0; c < compare1[r].length; c++) {
                if (compare1[r][c] != compare2[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equals(int[][] other) {
        if (matrix.length != other.length || matrix[0].length != other[0].length) {
            return false;
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] != other[r][c]) {
                    return false;
                }
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
        // take array from rowA and hold it in placeholder
        // move array from rowB into initial spot of rowA
        // place rowA into the empty spot left over from initial rowB

        if (rowA < 0 || rowB < 0 || rowA >= matrix.length || rowB >= matrix.length) {
            throw new IllegalArgumentException("Row dimension can't be out of bounds.");
        }

        int[] placeholderArray = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = placeholderArray;

    }

    // additonal methdods

}
