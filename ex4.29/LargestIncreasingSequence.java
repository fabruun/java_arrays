public class LargestIncreasingSequence {

    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 6, 0, 7, 9, 10, 11};
        System.out.println(largestIncreasingSequence(v));
    }

    /*
    * Given an array v, computes and returns the length of largest increasing
    * sequence of elements in v.
    */
    public static int largestIncreasingSequence(int[] v) {
        int i = 0;
        boolean ended = false;
        int size = 0;
        int consecutive = 0;
        while(i < v.length && !ended) {
            if(v[i] < v[i + 1]) {
                size = size + 1;
            } else {
                consecutive = size;
                size = 0;
            }
            i = i + 1;
            if(i == v.length - 1) {
                ended = true;
            }
        }

        return consecutive;

    }
}
