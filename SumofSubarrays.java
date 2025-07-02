// package 2025.sorting.Arrays;

//BRUTE FORCE 
public class SumofSubarrays {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int n = a.length;
        int sum = 0, MaxSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    sum += a[k];
                }
                if (sum > MaxSum) {
                    MaxSum = sum;
                    sum = 0;
                }
            }
        }
        System.out.println(MaxSum);
    }
}
