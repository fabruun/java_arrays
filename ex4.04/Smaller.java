public class Smaller {

    public static void main(String[] args) {
        int[] v = {2, 3, 5, 7, 9, 12};
        System.out.println(smallerThan(v, 9));
    }

    /*
    * Given an array v and a number b, computes and returns the
    * number of elements in v smaller than n.
    */
    public static int smallerThan(int[] v, int n) {
        int count = 0;
        int i = 0;
        while(i < v.length) {
            if(v[i] < n) {
                count = count + 1;
            }
            i = i + 1;
        }

        return count;
    }
}
