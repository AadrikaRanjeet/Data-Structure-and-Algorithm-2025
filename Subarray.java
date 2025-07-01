// package 2025.sorting.Arrays;

public class Subarray {
    public static void F(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k]);
                }
                System.out.println();
            }
        }
    }

}
