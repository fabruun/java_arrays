public class ToString {

    public static void main(String[] args) {
        int[] v = {2, 3, 7, 9, 13, 17, 23, 37, 73, 3301};
        System.out.println(toString(v));
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
}
