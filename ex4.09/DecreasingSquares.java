public class DecreasingSquares {

    public static void main(String[] args) {
        System.out.println(toString(decreasingSquares(73)));
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
    * Given a number n, computes and returns an array containing all the
    * natural numbers squared from the n to 1.
    */
    public static int[] decreasingSquares(int n) {
        int i = n;
        int index = 0;
        int[] squaresDecreased = new int[n];
        while(i >= 1) {
            squaresDecreased[index] = i * i;
            index = index + 1;
            i = i - 1;
        }

        return squaresDecreased;
    }

}
