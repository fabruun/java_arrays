public class Sum {

    public static void main(String[] args) {
        double[] v = {1, 2, 3};
        System.out.println(sum(v));
    }

    /*
     * Given an array v, computes the sum of all the integer value
     * of that array.
     */
     public static double sum(double[] v) {
         int i = 0;
         double sum = 0;
         while(i < v.length) {
             sum = sum + v[i];
             i = i + 1;
         }

         return sum;
     }
}
