public class Max {
    public static void main(String[] data) {
        int[] a = {3, 2, 4, 8, 1};

        int max = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
