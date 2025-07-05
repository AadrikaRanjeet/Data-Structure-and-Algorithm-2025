
//If all elements are negative : Robust Kadane Algortihm best one 

public class SumOfSubArray3 {
    public static void main(String[] args) {
        int[] a = { -5, -1, -3 };
        int n = a.length;
        int sum = a[0];
        int maxSum = a[0];

        for (int i = 1; i < n; i++) {
            sum = Math.max(sum, sum + a[i]);
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
