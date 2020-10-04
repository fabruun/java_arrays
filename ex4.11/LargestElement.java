public class LargestElement {

    public static void main(String[] args) {
        double[] v = {1, 2, 99, 1, 34, 44};
        System.out.println(max(v));
    }

    /*
     * Check all elements of an array and returns the largest item
     * of that array, return type is a double.
     */
     public static double max(double[] v) {
         int i = 0;
         double largest = 0;

         while(i < v.length) {
             if(v[i] > largest) {
                 largest = v[i];
             }
             i = i + 1;
         }

         return largest;
     }
}
