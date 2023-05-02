
public class Main {
    public static void main(String[] args) {
        //left-associative operators
        int result = 10 - 5 - 2;
        System.out.println("Result: " + result);

        //right-associative operators
        int result1 = 2 + 3 * 4;
        System.out.println("Result: " + result1);

        //DataTypes
        // primitive data types
        boolean boolVar = true;
        char charVar = 'A';
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        float floatVar = 3.14159f;
        double doubleVar = 3.141592653589793;

        // reference data types
        String stringVar = "Hello, World!";
        Integer integerVar = Integer.valueOf(123);
        Double doubleObjVar = Double.valueOf(3.14159);
        Boolean boolObjVar = Boolean.valueOf(false);

        // printing the values
        System.out.println("boolean variable: " + boolVar);
        System.out.println("char variable: " + charVar);
        System.out.println("byte variable: " + byteVar);
        System.out.println("short variable: " + shortVar);
        System.out.println("int variable: " + intVar);
        System.out.println("long variable: " + longVar);
        System.out.println("float variable: " + floatVar);
        System.out.println("double variable: " + doubleVar);
        System.out.println("String variable: " + stringVar);
        System.out.println("Integer variable: " + integerVar);
        System.out.println("Double object variable: " + doubleObjVar);
        System.out.println("Boolean object variable: " + boolObjVar);

    }
}