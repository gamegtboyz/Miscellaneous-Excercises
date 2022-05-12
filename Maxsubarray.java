public class Maxsubarray {
    public static void main(String[] args) {
        //given the [] a, which is array of 2 - 100,000 integers, each integer have the value not excess to 10,000.
        int[] a = {1, 3, 6, 1, 6, 6, 9, 9};

        Solution m = new Solution(a);
        System.out.println(m.maxSub(a));

        //the code below is to find all subarray whose first and last elements have the same value. Then find the largest possible sum of each subarray.
        /*
        int maxsub = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) {
                    int sum = 0;
                    for (int k = i; k <= j; k++) {
                        sum += a[k];
                    }
                    if (sum >= maxsub) { maxsub = sum;}
                }
            }
        }
        System.out.println(maxsub);
        */
    }
}

class Solution {
    Solution(int[] a) {
        int[] array = a;
    }
    public int maxSub(int[] array) {
        int maxsub = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    int sum = 0;
                    for (int k = i; k <= j; k++) {
                        sum += array[k];
                    }
                    if (sum >= maxsub) { maxsub = sum;}
                }
            }
        }
        return maxsub;
    }
}
