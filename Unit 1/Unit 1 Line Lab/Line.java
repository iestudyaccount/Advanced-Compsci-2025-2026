public class Line {

    // the only three instance variables we can use

    private int a;
    private int b;
    private int c;
    private Point p1;
    private Point p2;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line() {
        this.a = generateRandomParameters();
        this.b = generateRandomParameters();
        this.c = generateRandomParameters();
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.a = -(p2.getY() - p1.getY());
        this.b = (p2.getX() - p1.getX());
        this.c = -(this.a * p1.getX() + p1.getY() * this.b);
    }

    // getters

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    // setters

    public void setA(int newA) {
        a = newA;
    }

    public void setB(int newB) {
        b = newB;
    }

    public void setC(int newC) {
        c = newC;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double calculateSlope() {
        double slope;
        slope = -a / (double) b;
        return slope;
    }

    public boolean isCoordinateOnLine(Point p) {
        if (a * p.getX() + b * p.getY() + c == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "" + a + "x + " + b + "y + c = 0";
    }

    public boolean equals(Line other) {
        if (this.a == other.a
                && this.b == other.b
                && this.c == other.c) {
            return true;
        }
        return false;
    }

    public int generateRandomParameters() {
        int skibidi = (int) (Math.random() * 51 - 25);
        return skibidi;
    }

    public double calculateSlopeFromPoints() {
        int ydigitValues = p2.getY() - p1.getY();
        int xdigitValues = p2.getX() - p1.getX();
        double slope = ydigitValues / (double) xdigitValues;
        return slope;
    }

    public String generatePointSlopeFormula() {
        String ptSlopeFormula = "(y - " + p1.getY()
                + ") = " + this.calculateSlopeFromPoints()
                + "(x - " + p1.getX() + ")";
        return ptSlopeFormula;
    }

    // public String lineIsParallel(Line other) {
    // if (other.slope == this.slope / other.slope) {
    // return "The lines are parallel.";
    // } else {

    // return "The intersection point of the lines is" +
    // }
    // }

}
