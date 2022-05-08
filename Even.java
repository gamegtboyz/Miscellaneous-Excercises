public class Even {
    public static void main(String[] data) {
        int[] a = {3, 2, 5, 1, 4, 8};

        // the following code is to print only even integer in given array.
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
