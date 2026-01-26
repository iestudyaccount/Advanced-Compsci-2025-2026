public class SkyView {
    private double[][] view;

    SkyView(int numOfRows, int numOfCols, double[] scanned) {
        view = new double[numOfRows][numOfCols];

        // go one way, and when you hit that last space in the line, drop down and start
        // going the other way. when you hit that last space, drop down again and go the
        // way you started off (alternating)

        for (int rowNum = 0; rowNum <= numOfRows; rowNum++) {
            if (rowNum % 2 == 0) {
                for (int col = 0; col < view[rowNum].length; col++) {
                    view[rowNum][col] = scanned[col];
                }
            } else {
                for (int col = view[rowNum].length - 1; col >= 0; col--) {
                    view[rowNum][col] = scanned[col];
                }

            }
        }
    }

    public String toString() {
        String prep2Return = "";
        for (int r = 0; r < view.length; r++) {
        }
        return "";
    }

    public boolean equals(SkyView other) {
        if (this.SkyView = other.SkyView) {
            return true;
        }
        return false;
    }

    public double average(int startRow, int endRow, int startCol, int endCol) {
        double average = 0.0;

        return 0.0;
    }
}