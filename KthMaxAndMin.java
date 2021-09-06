import java.util.Scanner;

public class KthMaxAndMin {
    public static void main(String args[]) {
        int i, n = 0, k = 0;
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        System.out.println("Enter Array elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter K-th element: ");
        k = sc.nextInt();
        int temp, j;
        for (i = 1; i < n; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;

        }

        System.out.println("K-th minimum value: " + arr[k - 1]);
        System.out.println("K-th maximum value: " + arr[n - k]);
    }

}
