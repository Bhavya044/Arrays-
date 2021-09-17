import java.util.Scanner;


public class SelectionSort {
 
    public static void sort(int[] arr, int size) {
        int i, j, minIndx;
        for (i = 0; i < size - 1; i++) {
            minIndx = i;
            for (j = i ; j < size; j++) {
                if (arr[j] < arr[minIndx])
                    minIndx = j;

            }
           int temp=arr[minIndx];
            arr[minIndx]=arr[i];
            arr[i]=temp;

        }
    }
   
    public static void main(String args[])
    { int n,i,j,minIndx;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter String Elements= ");
          for(i=0;i<n;i++)
          {
              arr[i]=sc.nextInt();
          }
          System.out.println("Elements after Sort= ");
        sort(arr,n);
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

              

    }
}