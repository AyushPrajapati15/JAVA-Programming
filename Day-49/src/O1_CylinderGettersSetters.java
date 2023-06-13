//create a class cylinder and use getters and setters
// to set it's height and radius
class cylinder{
    private int radius;
    private int height;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
public class O1_CylinderGettersSetters {
    public static void main(String[] args) {
        float pi=3.14f;
        cylinder mycylinder=new cylinder();
        mycylinder.setHeight(10);
        int h= mycylinder.getHeight();
        System.out.println("The height is: "+h);
        mycylinder.setRadius(5);
        int r= mycylinder.getRadius();
        System.out.println("The radius is: "+r);
        System.out.println("The volume of cylinder is"+pi*r*r*h);
        System.out.println("The surface area of cylinder is"+((2*pi*r*h)+(2*pi*r*r)));

    }
}