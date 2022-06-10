class Maxint {
    public static void main(String[] args) {
        int[] input = {3, 30, 34, 5, 9};
        
        // create the max value from given integer array
        // create descending sorted array
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if(input[j] > input[j-1]) {
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }        

        //convert the sorted int[] onto String
        String[] k = new String[input.length];
        for(int i = 0; i < input.length; i++) {
            k[i] = String.valueOf(input[i]);
        }
        
        //append String
        String t = k[0];
        for(int i = 1; i < input.length; i++) {
            t += k[i];
        }
        
        // convert appended String onto integer
        int result = Integer.valueOf(t);
        System.out.println(result);
    }
}
