// getters and setters
class MyEmployee{
    private int id;
    private String name;

    public void setid(int i){
        id=i;
    }
    public  int getid(){
        return id;
    }
    public void setname(String n){
        name=n;
    }
    public  String getname(){
        return name;
    }
}
public class O1_getters_setters {
    public static void main(String[] args) {
        MyEmployee emp1=new MyEmployee();
        emp1.setid(101);
        emp1.setname("Alice");
        System.out.println(emp1.getid());
        System.out.println(emp1.getname());
    }
}