public class TwoZeros {

    public static void main(String[] args) {
        int[] v = {1, 2, 0, 7, 73, 0, 0, 73, 0};
        System.out.println(twoZeros(v));
    }

    /*
    * Given an array v, computes and returns if v contains two consecutive
    * zeros.
    */
    public static boolean twoZeros(int[] v) {
        boolean firstZero = false;
        boolean twoZeros = false;
        int i = 0;
        while(i < v.length && !twoZeros) {
            if(v[i] == 0) {
                firstZero =  true;
            }

            if(firstZero == true) {
                if(v[i + 1] == 0) {
                    twoZeros = true;
                } else {
                    firstZero = false;
                }
            }
            System.out.println(i);
            i = i + 1;
        }

        return twoZeros;
    }
}
