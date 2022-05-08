public class Chart {
    // this class is to create the bar chart from given array.
    public static void main(String[] data) {
        int[] a = {5, 7, 4, 6};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ": ");
            for (int j = 0; j < a[i]; j++) {
                System.out.print('o');
            }
            System.out.println();
        }
    }
}
