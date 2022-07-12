import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 7, 5, 9};


        System.out.println(Arrays.toString(reverse(array)));
    }

    public static int[] reverse(int[] arr) {
        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }

        return temp;
    }
}
