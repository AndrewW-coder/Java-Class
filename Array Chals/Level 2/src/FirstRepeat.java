import java.util.HashMap;

public class FirstRepeat {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 6, 3, 1};
        System.out.println(firstRepeat(array));
    }

    public static int firstRepeat(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(h.containsKey(arr[i])) {
                return h.get(arr[i]);
            }
            else{
                h.put(arr[i], i);
            }
        }

        return -1;
    }
}
