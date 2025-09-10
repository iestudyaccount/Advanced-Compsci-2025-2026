public class Rectangle {
    private int length;
    private int width;
    
    //constructrors
    //general default constructor

    public Rectangle() {
        //Initialize the private instance variables
        length = 5;
        width = 17;
    }

    //defines the instance variables with the local parameters
    public Rectangle(int desiredLength, int desiredWidth) {
        length = desiredLength;
        width = desiredWidth;
    }

    public Rectangle(int squareSideLength) {
        length = squareSideLength;
        width = squareSideLength;
    }

    // getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    //methods 
    public int getArea() {
        return length * width;
    }
    
    public int getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public double getDiagonal() { 
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }


    //setters
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public boolean equals(Rectangle otherRectangle) {
        if (
                this.length == otherRectangle.length
                && this.width == otherRectangle.width
        ) {
            return true;
        }
        return false;
    }
}
