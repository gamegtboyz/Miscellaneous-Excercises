public class ReverseEven {
    public static void main(String[] data) {
        int[] a = {2, 3, 4, 2, 1, 8, 6};

        int[] rev_a = new int[a.length];
        int rev_index = a.length - 1;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0) {
                rev_a[i] = a[i];
            }

            if (a[i] % 2 == 0) {
                if (a[rev_index] % 2 != 0) {
                    rev_index--;
                }

                if (a[rev_index] % 2 == 0) {
                    rev_a[i] = a[rev_index];
                    rev_index--;
                }
            }
        }
        for (int i = 0; i < rev_a.length; i++) {
            System.out.print(rev_a[i] + " ");
        }
    }
}
