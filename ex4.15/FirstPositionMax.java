public class FirstPositionMax {

    public static void main(String[] args) {
        int[] v = {331, 2, 3, 331, 7, 9, 3301};
        System.out.println(firstPositionMax(v));
    }

    /*
    * Given an array v, computes and returns the first occurrence of the index
    * with v's maximum element.
    */
    public static int firstPositionMax(int[] v) {
        int i = 0;
        int index = 0;
        int max = 0;
        while(i < v.length) {
            if(v[i] > max) {
                max = v[i];
                index = i;
            }
            i = i + 1;
        }

        return index;
    }
}
