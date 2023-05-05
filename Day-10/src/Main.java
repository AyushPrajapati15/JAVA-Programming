
public class Main {
    public static void main(String[] args) {
        String name = "ALICE DOE";
        System.out.println(name.toLowerCase());

        name=name.replace(" ",  "_");
        System.out.println(name);

        //
        String letter = "Dear <|name|>, Thanks a lot!";
        letter=letter.replace("<|name|>","Alice");

        System.out.println(letter);

        //prog to detect double and tripple spaces
        String myString="This string contains  double  and  tripple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //prog using escspe sequence characters
        String Letter2="Dear Alice,\n\t This review is helpful.\n\t Thanks!";
        System.out.println(Letter2);

    }
}