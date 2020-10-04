public class SquareIt {

    public static void main(String[] args)  {
        double[] v = {2, 3, 5, 7, 11, 13};
        squareIt(v);
    }

    // Given a array v, computes and returns a textual representation of v.
    public static String toString(double[] v) {
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
    * Given an array v, replaces each element of v with that element squared.
    */
    public static void squareIt(double[] v) {
        int i = 0;
        while(i < v.length) {
            v[i] = v[i]*v[i];
            i = i + 1;
        }

        System.out.println(toString(v));
    }
}
