public class O2_ForEachLoop {
    public static void main(String[] args) {
//        Array traversal using for loop
        int [] marks = {88,59,68,77,48,97};
        int i;
        for ( i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
//        printing array in reverse order
        System.out.println("Printing marks in reverse order");
        for ( i=marks.length-1; i>=0;i--){
            System.out.println(marks[i]);
        }
//For each loop
        for (int element:marks){
            System.out.println("printing using for each loop");
            System.out.println(element);
        }

    }
}
