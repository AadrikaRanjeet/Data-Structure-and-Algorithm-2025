public class LargestElementArray {
    public static void main(String[] args) {
        int[] a = { 5, -1, -2, -11, 0 };
        int n = a.length;
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            Math.max(Max, a[i]);
        }
        System.out.println(Max);
    }
}
