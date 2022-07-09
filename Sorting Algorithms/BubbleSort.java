import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 6, 3, 6, 8, 5, 3, 1, 8};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;

        while(true) {
            int switches = 0;

            for(int i = 0; i < len - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    switches += 1;
                }
            }

            if(switches == 0) {
                break;
            }
        }
    }
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }
}

