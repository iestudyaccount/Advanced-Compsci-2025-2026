public class Line {

    // the only three instance variables we can use

    private int a;
    private int b;
    private int c;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line() {
        this.a = ;
        this.b = ;
        this.c = ;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int newA) {
        a = newA;
    }

    public void setB(int newB) {
        b = newB;
    }

    public void setC(int newC) {
        c = newC;
    }

    public double calculateSlope() {
        double slope;
        slope = -a / (double) b;
        return slope;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        if (a * x + b * y + c == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "" + a + "x + " + b + "y = 0";
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
        Math.random()*

    }

}
