// package 2025.sorting.Arrays;

public class CountAllSubarray {
    public static void main(String[] args) {
        int a[] = { 5, 6, 7 };
        int sum = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum++;// counting all the subarrays
            }
        }
    }
}
