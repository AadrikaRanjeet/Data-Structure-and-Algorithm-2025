package Basic;

public class SecondLargestinArray {
    public static void main(String[] args) {
        int[] a = { 24, 3, -15, 10, -1 };
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > large) {
                secondLarge = large;
                large = a[i];
            } else if (a[i] > secondLarge && a[i] != large) {
                secondLarge = a[i];
            }
        }
        System.out.println(secondLarge);
    }
}
