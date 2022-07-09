import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 9, 4, 2, 5, 8, 2, 1, 10};

        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int temp_val = arr[i];
            int tempValIndex = i;
            for(int j = i - 1; j >= 0; j--) {
                if(arr[j] > temp_val) {
                    swap(arr, tempValIndex, j);
                    tempValIndex -= 1;
                }

                else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }

}

