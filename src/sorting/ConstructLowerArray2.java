package sorting;

public class ConstructLowerArray2 {


    void merge(int[] arr, int low, int mid, int high) {
        int n = mid - low + 1;
        int m = high - mid;

        int[] left = new int[n];
        int[] right = new int[m];
        for (int i = 0; i < n; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < m; i++) {
            right[i] = arr[mid + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = 0;
    }
}
