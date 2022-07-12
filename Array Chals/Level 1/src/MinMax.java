public class MinMax {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7, 4, 3, 9};
        minMax(array);
    }

    public static void minMax(int[] arr) {
        int low = arr[0];
        int high = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < low) {
                low = arr[i];
            }
            else if(arr[i] > high) {
                high = arr[i];
            }
        }
        System.out.println("Min: " + Integer.toString(low));
        System.out.println("Max: " + Integer.toString(high));
    }
}
