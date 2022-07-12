import java.util.HashMap;

public class FirstSingle {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3};
        System.out.println(firstSingle(array));
    }

    public static int firstSingle(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(h.containsKey(arr[i])) {
                h.put(arr[i], h.get(arr[i]) + 1);
            }
            else{
                h.put(arr[i], 1);
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(h.get(arr[i]) == 1) {
                return arr[i];
            }
        }

        return -1;
    }
}
