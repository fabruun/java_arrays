public class Shuffle {

    public static void main(String[] args) {
        int[] v = {2, 3, 5, 7, 11, 13};
        int[] w = {37, 73, 3301};
        System.out.println(toString(shuffle(v, w)));
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
    * Given two arrays v and w, computes and returns a new array by taking
    * alternately one element of v and w.
    */
    public static int[] shuffle(int[] v, int[] w) {
        int i = 0;
        int j = 0;
        int index = 0;
        boolean inner = false;
        int[] shuffledArray = new int[v.length + w.length];

        while(i < v.length) {
            inner = false;
            shuffledArray[index] = v[i];
            index = index + 1;
            i = i + 1;
            while(j < w.length && !inner) {
                shuffledArray[index] = w[j];
                index = index + 1;
                j = j + 1;
                inner = true;
            }
        }

        return shuffledArray;
    }
}
