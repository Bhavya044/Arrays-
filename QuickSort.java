import java.util.Scanner;

public class QuickSort {
    static void swap(int[] arr, int high, int low) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

    }

    public static int sort(int[] arr, int low, int high) {

        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (low < pivot) {
                low++;
            }
            while (high > pivot) {
                high--;
            }
            if (low <= high) {
                swap(arr, low, high);
            }

        }
        return low;

    }

    static void recursion(int[] arr, int low, int high) {
        int p = sort(arr, low, high);
        if (low < p - 1) {
            recursion(arr, low, p - 1);
        }
        if (p < high) {
            recursion(arr, p, high);
        }
    }

    static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, 0, n - 1);
        print(arr, n);

    }

}
