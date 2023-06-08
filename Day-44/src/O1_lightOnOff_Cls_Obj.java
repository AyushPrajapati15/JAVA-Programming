// stores the value for light true if light is on false if light is off
class Lamp {
    boolean isOn;
    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }
    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}
class O1_lightOnOff_Cls_Obj {
    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();
        led.turnOn();
        halogen.turnOff();
    }
}