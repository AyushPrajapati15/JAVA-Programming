// calculate the average marks of an array containing marks of all students using for each loop

public class O1_Program1 {
    public static void main(String[] args) {

        float [] marks={98,88,86,75,87,78};
        float sum=0;

        for(float element: marks){
            sum=sum+element;
        }
        System.out.println("The avg of all the marks is "+sum/marks.length);
    }
}