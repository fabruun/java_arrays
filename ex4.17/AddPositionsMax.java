public class AddPositionsMax {

    public static void main(String[] args) {
        int[] v = {3301, 2, 3301, 3, 3301};
        System.out.println(addPositionMax(v));
    }

    /*
    * Given an array v, computes and returns the sum of the indices of all
    * the occurrences of the largest element in v.
    */
    public static int addPositionMax(int[] v) {
        int i = 0;
        int max = 0;
        int sum = 0;
        while(i < v.length) {
            if(v[i] >= max) {
                max = v[i];
                sum = sum + i;
            }
            i = i + 1;
        }

        return sum;
    }
}
