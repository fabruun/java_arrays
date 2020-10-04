public class Squares {

    public static void main(String[] args) {
         /*
         * Functional abstraction used with toString method, in order to print
         * an array.
         */
         System.out.println(toString(squares(73)));
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
    * Given a number n, computes and returns an array containing the squares
    * of n.
    */
    public static int[] squares(int n) {
        int i = 0;
        int[] arraySquares = new int[n];
        while(i < arraySquares.length) {
            arraySquares[i] = i * i;
            i = i + 1;
        }

        return arraySquares;
    }
}
