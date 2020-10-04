import java.util.Arrays;
public class SubSet {

    public static void main(String[] args) {
        int[] v = {2, 3, 7, 9};
        int[] w = {2, 3, 7, 9, 13, 5};
        System.out.println(subset(v, w));
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
            text = text + v[i];
            i = i + 1;

        }

        return text;
    }

    /*
     * Takes two arrays v and w as parameters and returns if v is a subset of w.
     */
     public static boolean subset(int[] v, int[] w) {
         int i = 0;
         boolean isSubSet = false;
         int size = 0 ;
         while(i < v.length) {
             if(member(w, v[i]) == true) {
                 size = size + 1;
             }
             i = i + 1;
         }

         int[] intersection = new int[size];
         int j = 0;
         int index = 0;
         while(j < v.length) {
             if(member(w, v[j]) == true) {
                 intersection[index] = v[j];
                 index = index + 1;
             }
             j = j + 1;
         }


        int h = 0;
        while(h < v.length) {
            if(member(intersection, v[h])) {
                isSubSet = true;
            }
            h = h + 1;
        }


         return isSubSet;
     }
}
