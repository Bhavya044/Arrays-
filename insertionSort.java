import java.util.Scanner;


public class  insertionSort {
 
    public static void sort(int[] arr, int n) {
        int i, j, temp;
        for(i=1;i<n;i++)
        {
            temp=arr[i];
            j=i-1;
            while(arr[j]>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        }
    
   
    public static void main(String args[])
    { int n,i,j;
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
            System.out.println(arr[i]+" ");
        }

              

    }
}
