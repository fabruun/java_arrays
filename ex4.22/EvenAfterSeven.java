public class EvenAfterSeven {

    public static void main(String[] args) {
        int[] v = {2, 3, 5, 7, 10, 12, 14, 15, 17, 20, 22};
        System.out.println(evenAfterSeven(v));
    }

    /*
    * Given an array, computes and returns the number of even numbers after 7
    * in the array.
    */
    public static int evenAfterSeven(int[] v) {
        int i = 0;
        int count = 0;
        while(i < v.length) {
            if(v[i] > 7 && v[i] % 2 == 0) {
                count = count + 1;
            }
            i = i + 1;
        }

        return count;
    }
}
