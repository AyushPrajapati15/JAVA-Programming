//Wap to reverse an array
public class O3_Program3 {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int i,temp=0,n=arr.length/2,l=arr.length;
        for (i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-i-1]=temp;
        }
        System.out.println("The reverse array is");
        for (i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        // other method
        int [] arr1 = {1, 21, 3, 4, 5, 34, 67};
        int l1 = arr.length;
        int n1 = Math.floorDiv(l, 2);
        int temp1;

        for(int j=0; j<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp1 = arr[j];
            arr[i] = arr[l-j-1];
            arr[l-j-1] = temp1;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }
    }
}
