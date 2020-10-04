public class Remove {

    public static void main(String[] args) {
        int[] v = {2, 2, 2, 3, 5, 7, 11, 13};
        System.out.println(toString(remove(v, 2)));
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
    * Given two arrays v and w, computes and returns an array of elements
    * from v than are different from the number n.
    */
    public static int[] remove(int[] v, int n) {
        int i = 0;
        int size = 0;
        while(i < v.length) {
            if(n != v[i]) {
                size = size + 1;
            }
            i = i + 1;
        }

        int[] difference = new int[size];
        int index = 0;
        int j = 0;
        while(j < v.length) {
            if(n != v[j]) {
                difference[index] = v[j];
                index = index + 1;
            }
            j = j + 1;
        }

        return difference;
    }
}
