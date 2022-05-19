public class ReverseEven {
    public static void main(String[] data) {
        int[] a = {2, 3, 4, 2, 1, 8, 6};

        // build the new array with the same size, and int variable called revrsed index
        int[] rev_a = new int[a.length];
        int rev_index = a.length - 1;

        for (int i = 0; i < a.length; i++) {

            // if it's odd, place them on the same index
            if (a[i] % 2 != 0) {
                rev_a[i] = a[i];
            }

            // if it's even, find the new even from backwards
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
        // print the new reversed array
        for (int i = 0; i < rev_a.length; i++) {
            System.out.print(rev_a[i] + " ");
        }
    }
}
