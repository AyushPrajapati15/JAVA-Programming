//  12345
//  2345
//  345
//  45
//  5
        public class O2_pattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
