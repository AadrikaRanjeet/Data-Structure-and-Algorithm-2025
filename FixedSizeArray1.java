
/******* SLIDING WINDOW APPROACH *******/

/*
 * Sliding Window is useful when:
 * Subarray/window size is fixed (k)
 * You're asked to find max/min/sum/average of subarrays
 */

public class FixedSizeArray1 {
    public static void main(String[] args) {
        int[] a = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
        int k = 4;

        int n = a.length;

        if (n < k) {
            System.out.println("Invalid");
            return;
        }

        // Step 1 : calculating sum of first 'k' elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += a[i];
        }

        int maxSum = windowSum;

        // Step 2: slide the window forward
        for (int i = k; i < i + k; i++) {
            windowSum = windowSum + a[i] - a[i - k]; // add new, remove old
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
    }
}