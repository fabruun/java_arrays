public class SortedJoin {

    public static void main(String[] args) {
        int[] v = {2, 3, 5, 7, 11, 13};
        int[] w = {11, 37, 73, 89, 1000};
        System.out.println(toString(sortedJoin(v, w)));
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
    * Given two ordered arrays v and w, computes and return an ordered array
    * containing
    */
    public static int[] sortedJoin(int[] v, int[] w) {
        int i = 0;
        int index = 0;
        int[] sortedJoin = new int[v.length + w.length];
        while(i < v.length) {
            sortedJoin[index] = v[i];
            index = index + 1;
            i = i + 1;
        }

        int j = 0;
        while(j < w.length) {
            sortedJoin[index] = w[j];
            index = index + 1;
            j = j + 1;
        }

        int h = 0;
        int temp = 0;
        while(h < sortedJoin.length - 1) {
            if(sortedJoin[h] > sortedJoin[h + 1]) {
                temp = sortedJoin[h];
                sortedJoin[h] = sortedJoin[h+1];
                sortedJoin[h+1] = temp;
            }
            h = h + 1;
        }

        return sortedJoin;
    }
}
