public class TripleDupes {
    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.println(tripleDupes(A, B, C));
    }

    public static String tripleDupes(int[] arr1, int[] arr2, int[] arr3) {
        StringBuilder s = new StringBuilder();

        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = arr3.length;

        int i, j, k;
        i = j = k = 0;

        while(i < l1 && j < l2 && k < l3) {
            int val1 = arr1[i];
            int val2 = arr2[j];
            int val3 = arr3[k];

            int max_val = Math.max(val1, Math.max(val2, val3));

            while(i < l1 && arr1[i] < max_val) {
                i++;
            }

            while(j < l2 && arr2[j] < max_val) {
                j++;
            }

            while(k < l3 && arr3[k] < max_val) {
                k++;
            }

            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                s.append(max_val).append(" ");
                i++;
                j++;
                k++;
            }
        }

        return s.toString();
    }
}
