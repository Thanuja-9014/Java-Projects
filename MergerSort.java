package balaji;

public class MergerSort {

    // Function to merge two sorted subarrays
    void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Function to implement merge sort
    void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort the first and second halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Utility function to print the array
    void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        MergerSort ob = new MergerSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        ob.printArray(arr);
    }
}
