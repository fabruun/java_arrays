public class Equals {

    public static void main(String[] args) {
        int[] v = {2, 3, 5, 7, 11, 13, 2};
        int[] w = {2, 2, 2, 3, 3, 7, 11, 13, 13, 13, 13};
        System.out.println(setEquals(v, w));
    }

    // Given an array v and a number n, computes and returns if n appears in v.
    public static boolean member(int[] v, int n) {
        boolean isMember = false;
        int i = 0;
        while(i < v.length && !isMember) {
            if(v[i] == n) {
                isMember = true;
            }
            i = i + 1;
        }

        return isMember;
    }

    /*
    * Given an array v and w, computes and returns if they represent the
    * same set.
    */
    public static boolean setEquals(int[] v, int[] w) {
        int i = 0;
        boolean equal = false;
        int size = 0;
        while(i < w.length) {
            if(member(v, w[i]) == true) {
                size = size + 1;
                equal = true;
            }
            i = i + 1;
        }

        return size == w.length;

    }
}
