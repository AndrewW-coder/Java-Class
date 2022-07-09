import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 6, 7, 4, 2, 6, 2, 1, 9, 10, 3};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int lowestIndex = i;
            int lowestValue = arr[i];
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < lowestValue) {
                    lowestIndex = j;
                    lowestValue = arr[j];
                }
            }

            swap(arr, i, lowestIndex);
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }


}

