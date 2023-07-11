//Create a class Monkey with jump () and bite() methods Create a class Human
// which inherits. this Monkey class and implements BasicAnimal interface with
// eat() and sleep() methods.
class monkey{
    void jump(){
        System.out.println("Jumping.....");
    }
    void bite(){
        System.out.println("Biting....");
    }
}
interface BasicAnimal{
    void Eat();
    void Sleep();

}
class Human extends monkey implements BasicAnimal{
    void Speak(){
        System.out.println("Speaking....");
    }
    @Override
    public void Eat(){
        System.out.println("Eating.....");
    }
    @Override
    public void Sleep(){
        System.out.println("Sleeping.....");
    }

}

public class O2_Inheritance_Interface {
    public static void main(String[] args) {
        Human Alice=new Human();
        Alice.Eat();
        Alice.Sleep();
        Alice.Speak();
        Alice.bite();
        Alice.jump();
    }
}
