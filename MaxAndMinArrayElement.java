import java.util.*;

public class MaxAndMinArrayElement {
    public static void maxAndMin(int[] arr, int n) {
        int max, min;
        if (arr[0] > arr[1]) {
            max = arr[0];
            min = arr[1];
        } else {
            max = arr[1];
            min = arr[0];
        }
        for (int i = 2; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.println("Max element is: " + max);
        System.out.print("Min element is: " + min);

    }

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements= ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxAndMin(arr, n);

    }

}