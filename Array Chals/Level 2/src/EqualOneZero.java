import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class EqualOneZero {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 1, 1, 1};
        System.out.println(equalOneZero(array));
    }

    public static int equalOneZero(int[] arr) {
        int[] sums = new int[arr.length + 1];
        sums[0] = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                sum -= 1;
            }
            else {
                sum += 1;
            }

            sums[i + 1] = sum;
        }

        HashMap<Integer, Integer> h = new HashMap<>();
        int total = 0;

        for(int i = 0; i < sums.length; i++) {
            if(h.containsKey(sums[i])) {
                total += h.get(sums[i]);
                h.put(sums[i], h.get(sums[i]) + 1);
            }
            else{
                h.put(sums[i], 1);
            }
        }

        return total;
    }
}