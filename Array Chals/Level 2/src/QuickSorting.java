import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements are in your list?");
        int m = sc.nextInt();
        int[] array = new int[m];

        System.out.println("Enter the numbers in your list: ");
        for(int i = 0; i < m; i++) {
            array[i] = sc.nextInt();
        }

        quickSort(array, 0, m - 1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] l, int lb, int ub) {
        if(ub > lb) {
            Random r = new Random();
            int number = r.nextInt(lb, ub + 1);

            int index = partition(l, lb, ub, number);

            quickSort(l, index + 1, ub);
            quickSort(l, lb, index - 1);
        }

    }
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }

    public static int partition(int[] arr, int low, int high, int pivotIndex){
        int pivotValue = arr[pivotIndex];
        swap(arr, pivotIndex, high);
        int i = low;

        for(int j = low; j < high; j++) {
            if(arr[j] < pivotValue) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);

        return i;
    }
}

