public class O3_Break_Continue {
    public static void main(String[] args) {
//        Break and continue using loops

//        Break
        for (int i=0;i<10;i++){
            System.out.println(i);
            if (i==5){
                break;
            }
        }

//        Continue
        for (int j=0;j<10;j++){
            if (j==5){
                System.out.println("continue is used");
                continue;
            }
            System.out.println(j);
        }

//        Continue using while
        int k=0;
        while (k<5){
            k++;
            if (k==2){
                continue;
            }
            System.out.println(k);
        }

//        Break using while
        int a=0;
        while (a<5){
            a++;
            if (a==2){
                break;
            }
            System.out.println(a);
        }

//        Continue using do-While
        int b=0;
        do {
            b++;
            if (b==2){
                continue;
            }
            System.out.println(b);
        }while (b<5);

//        Break using do-While
        int c=0;
        do {
            c++;
            if (c==3){
                break;
            }
            System.out.println(c);
        }while (c<5);

    }
}
