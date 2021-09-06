import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements= ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements= ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array elements after reverse= ");
        for (j = i - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }

}
