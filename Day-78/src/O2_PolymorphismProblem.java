class monkey{
    void jump() {
        System.out.println("Jumping...");
    }
    void bite() {
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();

}
class human extends monkey implements BasicAnimal{
    void speak(){
        System.out.println("Speaking...");
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
public class O2_PolymorphismProblem {
    public static void main(String[] args) {
        human h1 =new human();
        h1.eat();
        h1.sleep();

        monkey m1= new human();
//        m1.speak();  -------> can not use the speak method because the reference is monkey which doesnot have speak method
        m1.jump();
        m1.bite();

        BasicAnimal ba = new human();
        ba.eat();
        ba.sleep();

    }
}
