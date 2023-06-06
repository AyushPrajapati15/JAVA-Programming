//Creating employee class with bits attributes and printing it
class employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class O1_empDetails_OOP {
    public static void main(String[] args) {
        employee emp1=new  employee(); // instantiating a  new employee object
        employee emp2=new  employee(); // instantiating a  new employee object
        //setting properties
        emp1.id=101;
        emp1.name="Alice";
        emp1.salary=15000;
        emp2.id=102;
        emp2.name="Bob";
        emp2.salary=12000;

//        System.out.println(emp1.id);
        emp1.printDetails();
//        int salary=emp1.getSalary();
//        System.out.println(salary);
        emp2.printDetails();
        System.out.println(emp1.getSalary());
    }
}