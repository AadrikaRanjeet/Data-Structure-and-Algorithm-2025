public class SumofSubArray2 {
    public static void main(String[] args) {
        int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = a.length;
        int sum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum < 0)
                sum = 0;
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
