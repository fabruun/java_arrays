public class Join {

    public static void main(String[] args) {
        int[] v = {2, 3, 5, 7, 11, 13, 17};
        int[] w = {37, 73, 3301};
        System.out.println(toString(join(v, w)));
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
    * Given two arrays v and w, computes and returns an array containing the
    * elements of v followed by the elements of w in the original order.
    */
    public static int[] join(int[] v, int[] w) {
        int[] join = new int[v.length + w.length];
        int i = 0;
        int index = 0;
        while(i < v.length) {
            join[index] = v[i];
            index = index + 1;
            i = i + 1;
        }

        int j = 0;
        while(j < w.length) {
            join[index] = w[j];
            index = index + 1;
            j = j + 1;
        }

        return join;
    }

}
