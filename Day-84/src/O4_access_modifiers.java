class Superclass {
    private int privateA;
    protected int protectedB;
    public int publicC;

    private void privateA1() {
        System.out.println("This is a private method in the superclass.");
    }

    protected void protectedB1() {
        System.out.println("This is a protected method in the superclass.");
    }

    public void publicC1() {
        System.out.println("This is a public method in the superclass.");
    }
}

class Subclass extends Superclass {
    public void accessSuperclassMembers() {
        // Accessing superclass members in the subclass
        // privateAV is not accessible in the subclass
        // privateA1() is not accessible in the subclass

        protectedB = 10; // Accessing a protected variable from the superclass
        protectedB1();      // Accessing a protected method from the superclass
        System.out.println(protectedB);

        publicC = 20;    // Accessing a public variable from the superclass
        publicC1();         // Accessing a public method from the superclass
        System.out.println(publicC);
    }
}

public class O4_access_modifiers {
    public static void main(String[] args) {
        Subclass subclassObj = new Subclass();
        subclassObj.accessSuperclassMembers();
    }
}
