public class Iteratemax {
    public static void main(String[] data) {
        double[] a = {2.5, 4.1, 3.7, 4.2};
        double[] b = {3.1, 3.8, 4.1, 4.0};

        double[] c = new double[a.length];

        for (int i = 0; i < c.length; i++) {
            if (a[i] >= b[i]) { c[i] = a[i]; }
            if (a[i] < b[i]) { c[i] = b[i]; }
        }

        for (int j = 0; j < c.length; j++) { System.out.print(c[j] + " "); }
    }
}
