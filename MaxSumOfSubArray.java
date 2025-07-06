public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] a = { 8, -1, 3, 4, -5, 2, -6, 7, 2, -8 };
        int n = a.length;
        int CurrentSum = a[0];
        int maxSum = a[0];
        int tempStart = 0;
        int start = 0, end = 0;

        for (int i = 1; i < n; i++) {
            if (CurrentSum + a[i] < CurrentSum) {
                CurrentSum = a[i];
                tempStart = i;
            } else {
                CurrentSum += a[i];
            }
            if (maxSum < CurrentSum) {
                maxSum = CurrentSum;
                start = tempStart;
                end = i;
            }
        }
        // Printing the Maximum Sum
        System.out.println(maxSum);
        // to print the subarray
        for (int i = start; i < end; i++) {
            System.out.println(a[i]);
        }
    }
}
