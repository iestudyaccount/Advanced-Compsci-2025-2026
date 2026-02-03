public class SkyView {
    private double[][] view;

    SkyView(int numOfRows, int numOfCols, double[] scanned) {
        view = new double[numOfRows][numOfCols];

        // go one way, and when you hit that last space in the line, drop down and start
        // going the other way. when you hit that last space, drop down again and go the
        // way you started off (alternating)

        for (int rowNum = 0; rowNum < numOfRows; rowNum++) {
            if (rowNum % 2 == 0) {
                for (int col = 0; col < view[rowNum].length; col++) {
                    view[rowNum][col] = scanned[col];
                }
            } else {
                for (int col = view[rowNum].length - 1; col >= 0; col--) {
                    view[rowNum][view[rowNum].length - 1 - col] = scanned[col];
                }

            }
        }
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    public String toString() {
        String prep2Return = "";
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[r].length;) {
                prep2Return += "" + view[r][c] + " ";
            }
            prep2Return += "\n";
        }
        return prep2Return;
    }

    public boolean equals(SkyView other) {
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[r].length; c++) {
                if (this.view[r][c] != other.view[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double average(int startRow, int endRow, int startCol, int endCol) {
        if (startRow < 0 || endRow >= view.length || startCol < 0 || endCol >= view[0].length) {
            throw new IllegalArgumentException("Parameters can't be out of bounds.");
        }

        double average = 0.0;
        double numToDivideBy = 0.0;
        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= view[r][endCol]; c++) {
                average += view[r][c];
                numToDivideBy++;
            }
        }

        return average / numToDivideBy;
    }
}