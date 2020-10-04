public class Zeros {

    public static void main(String[] args) {
        int[] v = {0, 2, 0, 3, 0, 1, 1, 0};
        System.out.println(zeros(v));
    }

    //Given an array v, computes the number of zeros in that array.
    public static int zeros(int[] v) {
        int i = 0;
        int zeros = 0;
        while(i < v.length) {
            if(v[i] == 0) {
                zeros = zeros + 1;
            }
            i = i + 1;
        }

        return zeros;
    }
}
