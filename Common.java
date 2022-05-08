public class Common {
    // this class is to find the number of common elements.
    public static void main(String[] data) {
        int[] a = {9, 4, 5, 1, 2};
        int[] b = {2, 7, 4, 8, 9};

        int common = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) { common++; }
            }
        }
        System.out.println(common);
    }
}
