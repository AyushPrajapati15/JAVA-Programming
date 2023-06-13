// overload a constructor used to initialize a rectangle
// of length 5 and breadth 10 for using custom parameter
class rectangle{
    private static int length;
    private static int breadth;

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public rectangle() {
        this.length = 5;
        this.breadth = 10;
    }

    public static int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
public class O2_RectCons {
    public static void main(String[] args) {
        rectangle rect1=new rectangle(4,5);
        rectangle rect2=new rectangle();

        int l1 = rectangle.getLength();
        int b1 = rectangle.getBreadth();

        System.out.println("The length of r1 is "+rect1.getLength());
        System.out.println("The breadth of r1 is "+rect1.getBreadth());

        System.out.println("The area of rect1 is "+l1*b1);
        System.out.println("The perimeter of rect1 is "+(2*(l1+b1)));

    }
}
