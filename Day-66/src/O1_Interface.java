// Interface
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle {
    //public int x = 5;
    void blowHorn() {
        System.out.println("Blowing horn");
    }

    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    public void speedUp(int increment) {
        System.out.println("Applying SpeedUP");
    }

    public void blowHornK3g() {
        System.out.println("Blowing horn song ");
    }

    public void blowHornmhn() {
        System.out.println("Horn! Horn! Horn! Horn!");
    }
}


public class O_Interface {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}
