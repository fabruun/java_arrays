public class Reverse {

    public static void main(String[] args) {
        int[] v = {2, 3, 5, 7, 11, 13, 9};
        reverse(v);
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
    * Given an array v, reverses it so the first element is the last and
    * vice-versa.
    */
    public static void reverse(int[] v) {
        int i = 0;
        int n = v.length - 1;
        int temp = 0;
        while(i < v.length) {
            if(n > i) {
                temp = v[n];
                v[n] = v[i];
                v[i] = temp;
            }
            n = n - 1;
            i = i + 1;
        }

        System.out.println(toString(v));
    }
}
