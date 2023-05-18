public class O1_Arrays {
    public static void main(String[] args) {
        int [] marks={10,20,30,40,50};
        System.out.println(marks[2]);
//        other method for initialization(Naive way\simple way)
        int [] marks1=new int[5];
        marks1[0]=100;
        marks1[1]=80;
        marks1[2]=50;
        marks1[3]=70;
        marks1[4]=85;
        System.out.println(marks1[3]);
        System.out.println(marks.length);

        float [] marks2={99.5f,22.5f,85.5f,77.5f};
        System.out.println(marks2[2]);

        String [] name={"Alice","Bob","Mike","jack"};
        System.out.println(name[2]);
    }
}