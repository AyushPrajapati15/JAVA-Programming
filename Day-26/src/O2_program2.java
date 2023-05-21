// wap to add two matrices of size 2x3
public class O2_program2 {
    public static void main(String[] args) {
        int i,j;
        int [][]m1={{10,20,30},{10,20,30}};
        int [][]m2={{40,50,60},{30,40,50}};
        int [][]sum={{0,0,0},{0,0,0}};
        for (i=0;i<m1.length;i++){
            for (j =0;j<m1[i].length;j++){
                sum[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("The sum of m1 and m2 are: ");
        for (i=0;i<m1.length;i++){
            for(j=0;j<m2[i].length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
