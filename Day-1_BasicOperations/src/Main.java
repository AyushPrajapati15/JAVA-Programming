import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
    //variables
        /*
        System.out.println("Hello world");
        String name ="Alice";
        String last="Bob";
        int a=10;

         */
        //accessing variables
        /*

        System.out.println(name);
        System.out.println(last);
        System.out.println(a);
        //assigning value of one variable to another new variable
        String new_name=name;
        System.out.println(new_name);

         */

        // PRIMITIVE DATA TYPES
        /*
        //byte - 1 [-128 to +127]
        //short - 2
        //int - 4 [1,2,3,4]
        //long - 8
        //float - 4 [3.14]
        //double - 8
        //char - 2
        //boolean - 1 [true\false]

        byte age =30;
        int phone = 1234567890;
        long phone2 = 12345678900L;//to store long type we have to add l\L after assigning the value so that it will not give any red line
        float pi =3.14F;//to store float type we have to add f\F after assigning the value so that it will not give any red line
        char letter = '#';
        boolean isAdult = true||false;

         */

        // NON PRIMITIVE \REFERENCE DATA TYPES

        //Strings - In java strings are immutable i.e if once a string is created then it cannot be changed.
        /*
        String isName = "AYUSH";
        System.out.println(isName.length());
        String name= new String(  "Ayush");
        String Friend = new String ("Twinkle");
         */
        //concatenate - used to join two strings
        /*
        String name1 = "Hello";
        String name2 = "Friends";
        String name3 = name1 + name2;
        String name4 = name1+ " and " + name2;
        System.out.println(name3);
        System.out.println(name4);
         */
        //charAt(value) - used to search character which is present in come position
        /*
        String name = "Alice";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
         */
        //length() - it returns the length of a string
        /*
        String name = "Alice";
        System.out.println(name.length());
         */

        //replace - used to replace a char with new char.
        // Syntax - variableName.replace('oldChar','NewChar');
        /*
        String name = "Alice";
        String name2 = name.replace('i','a');
        System.out.println(name2);
        System.out.println(name2.replace('a','i')); //it is case-sensitive
         */

        //Substring - Used to fetch a particular string from the original string By giving the index number.
        /*
        String name3 = "Alice and Bob";
        System.out.println(name3.substring(0, 5));//1st index is included but the last index is not included int the string
        System.out.println(name3.length());
         */

        //ARRAY - It is non-primitive data types so we'll have to use 'new' keyword.
        // in java if we do not initialize a variable with a value then it do not stores garbage value in it rather it stores NULL
        /*
        int [] marks = new int[5];
        marks[0] = 98;
        marks[1] = 99;
        marks[2] = 95;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);//it will return NULL as we have not stored any value to it.

        boolean [] age = new boolean[2];
        System.out.println(age[0]);// it will return 'FALSE' because we have not assigned any value to it and it will not return any garbage value
        //another way to declate array as 'c'.
        int [] data = {10,20,30};
        System.out.println(data[0]);

         */

        // ARRAY length, sort

        /*
        //length
        int[] marks = new int[5];
        marks[0] = 50;
        marks[1] = 20;
        marks[2] = 30;
        System.out.println(marks.length); // Here we will not use '()' because it is the property of array so, we don't call a property by function'()' .

        // sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);// it will return 0 because the lowest marks is 0 i.e null because marks[4] & marks[5] is not assigned so it will return 0.

         */

        //2D ARRAY







        
    }
}