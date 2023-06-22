// Program using this keyword
class a {
    int x;
    public int getX() {
        return x;
    }
    a(int x) {
        x = x;
    }
}
    class b {
        int x;
        public int getX() {
            return x;
        }
        b(int x) {
            this.x = x;
        }
}
public class O1_this {
    public static void main(String[] args) {
        a obj1 = new a(65);
        System.out.println(obj1.getX());

        b obj2 = new b(65);
        System.out.println(obj2.getX());
    }
}
