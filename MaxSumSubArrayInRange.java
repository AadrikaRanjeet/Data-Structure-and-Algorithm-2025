public class MaxSumSubArrayInRange {
    public static void main(String[] args) {
        int[] a = { 1, 2, -1, 3, 4, 5, 6 };
        int l = 2, r = 6;

        int currentSum = a[l];
        int maxSum = a[l];
        int tempStart = l;
        int start = l, end = l;

        for (int i = l + 1; i <= r; i++) {
            if (currentSum + a[i] < a[i]) {
                currentSum = a[i];
                tempStart = i;
            } else {
                currentSum += a[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // Output
        System.out.println("Max Sum = " + maxSum);
        System.out.print("Subarray = [");
        for (int i = start; i <= end; i++) {
            System.out.print(a[i]);
            if (i < end)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
