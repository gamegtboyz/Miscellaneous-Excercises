public class Mostoccurrence {
    // this class is to return the most occurred elements of the given integer.
    public static void main (String[] data) {
        int[] a = {3, 6, 2, 8, 6, 4, 3, 6};

        int[] b = new int[a.length]; // this is array of occurrences obtained

        for (int i = 0; i < a.length; i++) {
            b[i] = 1;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i] && j < i) {
                    b[i] = 0;
                    break;
                }

                if (a[j] == a[i] && j > i) {
                    b[i]++;
                }
            }
        }
        /*
        System.out.print("The occurrence count array is ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
         */

        int imax = 0;

        for (int j = 0; j < b.length; j++) {
            if (b[imax] < b[j]) {
                imax = j;
            }
        }
        //System.out.println("index of most occurred number is " + imax);
        System.out.println("The most occurred element is " + a[imax]);
    }
}
