public class PositionsMax {

    public static void main(String[] args) {
        int[] v = {3301, 1, 2, 3, 3301, 73, 37, 3301};
        System.out.println(toString(positionsMax(v)));
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
    * Given an array v, computes and returns an array containing indices of
    * all of v's maximum element.
    */
    public static int[] positionsMax(int[] v) {
        int i = 0;
        int max = 0;
        int size = 0;
        while(i < v.length) {
            if(v[i] >= max) {
                max = v[i];
                size = size + 1;
            }
            i = i + 1;
        }

        int index = 0;
        int[] positions = new int[size];
        max = 0;
        i = 0;
        while(i < v.length) {
            if(v[i] >= max) {
                max = v[i];
                positions[index] = i;
                index = index + 1;
            }
            i = i + 1;
        }

        return positions;
    }
}
