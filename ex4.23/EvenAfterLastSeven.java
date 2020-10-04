public class EvenAfterLastSeven {

    public static void main(String[] args) {
        int[] v = {2, 3, 5, 7, 10, 12, 7, 10, 12, 14, 16, 15, 20, 22};
        System.out.println(evenAfterLastSeven(v));
    }

    /*
    * Given an array v, computes and returns the number of even numbers after
    * the last occurence of seven in that array.
    */
    public static int evenAfterLastSeven(int[] v) {
        int i = 0;
        int count = 0;
        int index = 0;
        while(i < v.length) {
            if(v[i] == 7) {
                index = i;
            }
            i = i + 1;
        }

        i = 0;
        while(i < v.length) {
            if(i >= index) {
                if(v[i] % 2 == 0) {
                    count = count + 1;
                }
            }
            i = i + 1;
        }

        return count;
    }

}
