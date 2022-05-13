public class Tank {
    // given the String represents the plot consisted of house and blank pot, write the code to place the water tank with least number of tank as possible.
    public static void main(String[] data) {
        String S = "H--H-----H--H-HH-";
        char[] c = S.toCharArray();

        // the following code is to consider on each blank plot, if the neighborhood plot is under defined condition, we placed the tank on that plot. We call this one as 'planter'
        for (int i = 1; i < c.length; i++) {
            // in the first element consideration we should make sure that if there's a house, the tank should be placed.
            if (i == 1 && c[i] == '-') {
                if (c[i-1] == 'H') {
                    c[i] = 'T';
                }
            }

            // in the last element consideration we should make sure that if there's a house, the tank should be placed.
            if (i == c.length - 1 && c[i] == 'H') {
                if (c[i-1] != 'H') {
                    c[i-1] = 'T';
                }
            }

            // this is consideration onto the remaining elements
            if (c[i] == '-') {
                if (c[i-1] == 'H' && c[i-2] != 'T') {
                    c[i] = 'T';
                }
            }
        }

        // the following code is to recheck that the given array is solvable.
        boolean tankatside = true;
        for (int j = 0; j < c.length; j++) {
            // consider if there is only one element in the given array
            if (c.length == 1) {
                tankatside = false;
                break;
            }

            // consider if the first element is unsolvable
            if (j == 0 && c[j] == 'H') {
                if (c[j+1] != 'T') {
                    tankatside = false;
                    break;
                }
            }

            // consider if the last element is unsolvable
            if (j == c.length - 1 && c[j] == 'H') {
                if (c[j-1] != 'T') {
                    tankatside = false;
                    break;
                }
            }

            // consider if the remaining element is unsolvable
            if (j == 1 && c[j] == 'H') {
                if (c[j-1] != 'T' && c[j+1] != 'T') {
                    tankatside = false;
                    break;
                }
            }
        }

        // this code is to check if the given plot could be solved.
        if (tankatside == false) {System.out.println("This given plot is unsolvable.");}

        if (tankatside == true) {
            // this code is to print out redefined array.
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i] + " ");
            }
            System.out.println();

            // this code is to count number of placed tanks.
            int count = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[j] == 'T') {count++;}
            }
            System.out.println("Minimum number of placed tank is " + count);
        }
    }
}

