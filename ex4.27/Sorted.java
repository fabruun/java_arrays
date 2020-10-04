public class Sorted {

    public static void main(String[] args) {
        int[] v = {1, 3, 4, 5, 7, 9 };
        System.out.println(isSorted(v));
    }

    /*
    * Given an array v, check if it's elements are sorted.
    */
    public static boolean isSorted(int[] v) {
        int i = 0;
        int count = 0;
        while(i < v.length - 1) {
            if(v[i] < v[i + 1]) {
                count = count + 1;
            }
            i = i + 1;
        }

        int j = 0;
        while(j < v.length) {
            if(j == v.length - 1) {
                if(v[j] > v[j - 1]) {
                    count = count + 1;
                }
            }
            j = j + 1;
        }

        return count == v.length;
    }
}
