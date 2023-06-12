//this is Paramerterized constructor
class myemployee{
    myemployee(String s,int n){
        System.out.println("The id of emp1 is: "+n+" and the name is: "+s);
    }
}
public class O2_def {
    public static void main(String[] args) {
        Myemploye emp1=new Myemploye("Alice",101);
        Myemploye emp2=new Myemploye("Bob",102);
        Myemploye emp3=new Myemploye("Mary",103);
    }
}
