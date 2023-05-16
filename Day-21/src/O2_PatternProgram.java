//              1
//             2 3
//            4 5 6
//           7 8 9 10
//         11 12 13 14 15

import java.util.Scanner;
public class O2_PatternProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}