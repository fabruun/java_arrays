public class LastPositionMax {

    public static void main(String[] args) {
        int[] v = {3301, 2, 3301, 1, 3301};
        System.out.println(lastPositionMax(v));
    }

    /*
    * Given an array v, computes and returns the index of the last occurrence
    * of the largest element.
    */
    public static int lastPositionMax(int[] v) {
        int i = 0;
        int index = 0;
        int max = 0;
        while(i < v.length) {
            if(v[i] >= max) {
                max = v[i];
                index = i;
            }
            i = i + 1;
        }

        return index;
    }
}
