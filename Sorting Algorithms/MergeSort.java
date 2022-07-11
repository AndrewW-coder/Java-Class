import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 6, 7, 9, 3, 2};

        mergeSort(array, 0, 7);
        System.out.println(Arrays.toString(array));

    }

    public static void mergeSort(int[] arr, int lb, int ub) {
        if(lb < ub) {
            int mid = (lb + ub - 1)/2; //midpoint of array

            mergeSort(arr, lb, mid); //makes sure everything left is length 1
            mergeSort(arr, mid + 1, ub); //makes sure everything right is length 1

            merge(arr, lb, ub, mid); //merges all the arrays together
        }
    }

    public static void merge(int[] arr, int lb, int ub, int m) {

        int len1 = m - lb + 1; //length of first list
        int len2 = ub - m; //length of second list

        int[] L = new int[len1]; //establishes array with length
        int[] R = new int[len2]; //establishes array with length

        for(int i = 0; i < len1; i++) { //adds all the numbers to first list
            L[i] = arr[i + lb];
        }

        for(int i = 0; i < len2; i++) { //adds all the number to second list
            R[i] = arr[i + m + 1];
        }

//         System.out.println(Arrays.toString(L));
//         System.out.println(Arrays.toString(R));

        int i = 0, j = 0;
        int k = lb;

        while(i < len1 && j < len2) {
            if(L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < len1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < len2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
