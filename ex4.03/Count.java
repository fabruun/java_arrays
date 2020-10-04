public class Count {

    public static void main(String[] args) {
        int[] v = {73, 2, 1, 2, 73, 37, 73};
        System.out.println(count(v, 73));
    }

    /*
    * Given an array v and a number n, computes and returns
    * the number of occurrrences of n in v.
    */
    public static int count(int[] v, int n) {
        int count = 0;
        int i = 0;
        while(i < v.length) {
            if(v[i] == n) {
                count = count + 1;
            }
            i = i + 1;
        }

        return count;
    }
}
