import java.util.List;
    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.Set;
    import java.util.TreeSet;
    import java.util.Map;
    import java.util.TreeMap;

    class MaxSubArray {
        public static void main(String[] args) {
            int[] a = {1, 3, 6, 1, 6, 6, 9, 9};
            Map<Integer, Integer> first = new TreeMap<>();
            Map<Integer, Integer> last = new TreeMap<>();
            int accumulate = 0;
            for (int i: a) {
                accumulate += i;
                Integer f = first.get(i);       // access the first Map to find if there's same integer. If there's no same integer placed before, first.get(i) == null
                if ( f == null ) {              // if we found it for the first time, we will add it onto first Map
                    first.put(i, accumulate);
                } else {                        // if we didn't find it for the first time, f will return that number, we will add it onto last map. (and if there's multiple occurrence, the new one wil overwrite it.)
                    last.put(i, accumulate);
                }
            }
            System.out.println(first);
            System.out.println(last);
            
            Integer result = null;
            for (Integer z : last.keySet()) {   // the .keyset() is the arrays of keys (which is, in this case, each element of int[]a. the last.keyset() contains the keyset which coulc built subarrays.)
                Integer start = first.get(z);
                Integer finish = last.get(z);
                int total = finish - start + z;
                System.out.println(total);
                
                if (result == null) {result = total;}
                if (total > result) {result = total;}
            }
            System.out.println("largest sum is " + result);
        }
    }
