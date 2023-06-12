//this is parameterized constructor with constructor overloading
class Myemploye {
    Myemploye(String name, int id){
        System.out.println("The id of emp1 is: "+name+" and the name is: "+id);
    }
    Myemploye(String name, int id, int sal){
        System.out.println("The id of emp2 is: "+name+" , the name is: "+id+" and salary is "+sal);
    }
}
public class O3_ConsOverloading {
    public static void main(String[] args) {
        Myemploye emp1=new Myemploye("ALice",101);
        Myemploye emp2=new Myemploye("Bob",102,55000);

    }

}
