import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 1};
        int[] array2 = {1, 7, 8, 3, 8};
        int[] output = merge(array, array2);

        System.out.println(Arrays.toString(output));


    }

    public static void mergeSort(int[] arr, int lb, int ub) {
        if(ub > lb) {
            int mid = (lb + ub - 1) / 2;

            int size1 = mid - lb + 1;
            int size2 = ub - mid;

            int[] firstHalf = new int[size1];
            int[] secondHalf = new int[size2];

            for(int i = 0; i < size1; i++) {
                firstHalf[i] = arr[lb + i];
            }

            System.out.println(Arrays.toString(firstHalf));

            for(int j = 0; j < size2; j++) {
                secondHalf[j] = arr[j + mid + 1];
            }


            System.out.println(Arrays.toString(secondHalf));

            merge(firstHalf, secondHalf);

            mergeSort(firstHalf, lb, mid);
            mergeSort(secondHalf, mid, ub);


        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int oneLength = arr1.length;
        int twoLength = arr2.length;

        int oneCount = 0;
        int twoCount = 0;
        int totalCount = 0;

        int totalLength = oneLength + twoLength;

        int[] finalArray = new int[totalLength];

        while(oneCount < oneLength && twoCount < twoLength) {
            if(arr1[oneCount] < arr2[twoCount]) {
                finalArray[totalCount] = arr1[oneCount];
                oneCount++;
            }
            else {
                finalArray[totalCount] = arr2[twoCount];
                twoCount++;
            }
            totalCount++;
        }

        while(oneCount < oneLength) {
            finalArray[totalCount] = arr1[oneCount];
            oneCount++;
            totalCount++;
        }

        while(twoCount < twoLength) {
            finalArray[totalCount] = arr2[twoCount];
            twoCount++;
            totalCount++;
        }

        return finalArray;
    }
}
