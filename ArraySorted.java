public class ArraySorted {
    public class CheckSorted {
        public static boolean isSorted(int[] a) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    return false; // Not sorted
                }
            }
            return true; // Sorted
        }

        public static void main(String[] args) {
            int[] a = { -12, -1, -5, -10 };
            if (isSorted(a)) {
                System.out.println("Array is sorted.");
            } else {
                System.out.println("Array is NOT sorted.");
            }
        }
    }
}
