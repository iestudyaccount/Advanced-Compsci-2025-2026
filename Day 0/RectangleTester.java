public class RectangleTester {
    public static void main(String[] args) {
        //Declaration: type name
        //Instantitation/initilization: = new type();
        Rectangle joe = new Rectangle();
        joe.getWidth();
        Rectangle moe = new Rectangle();
        moe.getLength();
        Rectangle toe = new Rectangle();
        toe.getArea();
        toe.setLength(67);
        Rectangle olivioe = new Rectangle(6, 7);
        olivioe.getArea();
        Rectangle samueloe = new Rectangle(4, 10);
        samueloe.getDiagonal();
        Rectangle stoutoe = new Rectangle(8);
        stoutoe.getPerimeter();

        System.out.println("Testing getWidth: " + joe.getWidth());

        System.out.println("Testing getLength: " + moe.getLength());
        
        System.out.println("Testing setLength: " + toe.getLength());
        toe.setLength(67);
        System.out.println("After setter, length is " + toe.getLength());

        System.out.println("Testing Perimeter: " + stoutoe.getPerimeter());

        System.out.println("Testing Diagonal: " + samueloe.getDiagonal());

    if (joe.equals(toe)) {
                System.out.println("They are the same");
            } 
            else {
                System.out.println("They are not the same");
            }

        if (joe.equals(samueloe)) {
                System.out.println("They are the same");
            } 
            else {
                System.out.println("They are not the same");
            }
    
    }
}
