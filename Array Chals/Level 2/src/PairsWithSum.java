import java.util.HashMap;

public class PairsWithSum {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 1};
        System.out.println(pairsWithSet(array, 6));
    }

    public static int pairsWithSet(int[] arr, int n) {
        int pairs = 0;
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
            if(n - arr[i] != arr[i]) {
                if(h.containsKey(n - arr[i])) {
                    pairs += h.get(n - arr[i]);
                }
            }

            else {
                pairs += h.get(arr[i]) - 1;
            }
        }

        return (pairs/2);
    }
}
