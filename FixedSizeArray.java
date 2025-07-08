//Given an array of integers and a number k, find the maximum sum of a subarray of size k.

/*Input: arr = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4  
Output: 39  
Explanation: Subarray [4, 2, 10, 23] has max sum = 39
 */

/***** BRUTE FORCE APPROACH *****/

class FixedSizeArray {
    public static void main(String[] args) {
        int[] a = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
        int k = 4;

        int sum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < i + k; j++) {
                sum += a[j];
            }

            if (maxSum < sum) {
                maxSum = sum;
            }
            sum = 0;
        }
    }
}