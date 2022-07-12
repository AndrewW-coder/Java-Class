import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 5, 4, 6, 8, 3, 4, 2};
        plusOne(array);
        System.out.println(Arrays.toString(array));
    }

    public static void plusOne(int[] arr) {
        int temp = arr[0];

        for(int i = 0; i < arr.length - 1; i++) {
            int temp1 = arr[i + 1];
            arr[i + 1] = temp;
            temp = temp1;
        }

        arr[0] = temp;
    }
}
