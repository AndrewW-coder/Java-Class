import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Duplicates {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 4, 1, 6, 7, 8, 9};
        System.out.println(findDupes(array));
    }

    public static String findDupes(int[] arr) {
        StringBuilder op = new StringBuilder();

        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(h.containsKey(arr[i])) {
                h.put(arr[i], h.get(arr[i]) + 1);
            }
            else{
                h.put(arr[i], 1);
            }
        }

        System.out.println(h);

        for(Map.Entry<Integer, Integer> element: h.entrySet()) {
            if(element.getValue() > 1) {
                op.append(element.getKey()).append(" ");
            }
        }

        return op.toString();
    }
}
