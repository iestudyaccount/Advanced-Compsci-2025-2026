public class RectangleTester {
    public static void main(String[] args){
        //Declaration: type name
        //Instantitation/initilization: = new type();
        Rectangle joe = new Rectangle();
        Rectangle moe = new Rectangle();
        Rectangle toe = new Rectangle();
        Rectangle olivioe = new Rectangle(6, 7);
        Rectangle samueloe = new Rectangle(4, 10);
        Rectangle stoutoe = new Rectangle(8);

        joe.getWidth();
        moe.getLength();
        toe.calcArea();
        toe.setLength(67);
        olivioe.calcArea();
        samueloe.calcDiagonal();
        stoutoe.calcPerimeter();

        System.out.println("Testing getWidth: " + joe.getWidth());

        System.out.println("Testing getLength: " + moe.getLength());
        
        System.out.println("Testing setLength: " + toe.getLength());
        toe.setLength(67);
        System.out.println("After setter, length is " + toe.getLength());

        System.out.println("Testing Perimeter: " + stoutoe.calcPerimeter());

        System.out.println("Testing Diagonal: " + samueloe.calcDiagonal());
    }
    
}
