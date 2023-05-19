// String starts with "A"
public class O1_StartsWith {
    public static void main(String[] args) {

            String[] strings = {"Apple", "Banana", "Ant", "Avocado", "Cat"};

            int count = 0;

            for (String str : strings) {
                if (str.startsWith("A")) {
                    count++;
                }
            }
            System.out.println("The number of strings starting with 'A' is: " + count);
        }
    }



