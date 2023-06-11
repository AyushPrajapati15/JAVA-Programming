//getters setters 2
class employee{
    private  int id;
    private String name;
    public void setid(int i){
        this.id=i;
    }
    public  int getid(){
        return id;
    }
    public void setname(String n){
        this.name=n;
    }
    public  String getname(){
        return name;
    }
}
public class O2_getters_setters2 {
    public static void main(String[] args) {
        MyEmployee emp1=new MyEmployee();
        emp1.setid(1024);
        emp1.setname("Jack");
        System.out.println(emp1.getid());
        System.out.println(emp1.getname());
    }
}
