public class Compare {

    public static void main(String[] args) {
        int[] v = {2, 3, 5, 7, 11, 13, 17, 23, 27, 37};
        System.out.println(toString(compare(v, 13)));
    }

    // Given a array v, computes and returns a textual representation of v.
    public static String toString(int[] v) {
        String text = "";
        int i = 0;
        while(i < v.length) {
            if(v[i] != v[v.length - 1]) {
                text = text + v[i] + ", ";
            } else {
                text = text + v[i];
            }
            i = i + 1;

        }

        return text;
    }

    /*
    * Given an array v and a number n, returns an array containing firsly the
    * number of elements of v larger than, secondly the number element equal,
    * to n, and thirdly the number of elements smaller than n.
    */
    public static int[] compare(int[] v, int n) {
        int i = 0;
        int[] comparison = new int[3];
        int larger = 0;
        int equal = 0;
        int smaller = 0;
        while(i < v.length) {
            if(v[i] > n) {
                larger = larger + 1;
            }
            if(v[i] == n) {
                equal = equal + 1;
            }
            if(v[i] < n) {
                smaller = smaller + 1;
            }
            i = i + 1;
        }
        comparison[0] = larger;
        comparison[1] = equal;
        comparison[2] = smaller;

        return comparison;

    }
}
