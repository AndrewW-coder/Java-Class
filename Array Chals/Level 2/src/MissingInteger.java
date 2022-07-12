import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        System.out.println(missingInt(array, 10));
    }

    public static int missingInt(int[] arr, int n) {
        int sum = n * (n + 1)/2;

        for(int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }

        return sum;
    }
}
