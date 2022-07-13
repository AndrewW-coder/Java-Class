import java.util.Arrays;

public class Peak {
    public static void main(String[] args) {
        int[] array = {6, 1, 15, 19, 9, 13, 12, 6, 7, 2, 10, 4, 1, 14, 11, 14, 14, 13};
        int[] arr1 = {3, 2, 4};

        System.out.println(findPeak(arr1, 3));
    }

    public static int findPeak(int[] arr, int n) {
        int l = 0;
        int r = n - 1;


        while(l < r) {
            int mid = (l + r - 1)/2;

            if(arr[mid] >= arr[mid + 1]) {
                int lenR = r - mid;
                r -= lenR;
            }

            else{
                int lenL = mid - l + 1;
                l += lenL;
            }
        }

        return l;
    }

}
