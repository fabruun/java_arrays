public class Intersection {

    public static void main(String[] args) {
        int[] v = {2, 3, 5, 7, 13, 3301, 90, 100};
        int[] w = {2, 3, 5, 7, 11, 13, 17, 23, 31, 73, 3301};
        System.out.println(toString(intersection(v, w)));
    }

    // Given an array v and a number n, computes and returns if n appears in v.
    public static boolean member(int[] v, int n) {
        boolean isMember = false;
        int i = 0;
        while(i < v.length && !isMember) {
            if(v[i] == n) {
                isMember = true;
            }
            i = i + 1;
        }

        return isMember;
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
    * Given two arrays v and w, computes and returns an array containing the
    * elements that occur in both arrays.
    */
    public static int[] intersection(int[] v, int[] w) {
        int i = 0;
        int size = 0;
        while(i < v.length) {
            if(member(w, v[i])) {
                size = size + 1;
            }
            i = i + 1;
        }

        int[] intersection = new int[size];
        int j = 0;
        int index = 0;
        while(j < v.length) {
            if(member(w, v[j])) {
                intersection[index] = v[j];
                index = index + 1;
            }
            j = j + 1;
        }

        return intersection;
    }
}
