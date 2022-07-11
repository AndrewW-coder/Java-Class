public class Peak {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 6, 2};
        System.out.println(peak(array))
    }
    public static int peak(int[] arr) {
        if(arr[0] >= arr[1]) {
            return 0;
        }
        for(i = 1; i < arr.length - 1; i++; {
            if(arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                return i
            }
        }
        return arr.length - 1;
    }
}
