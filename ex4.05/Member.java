public class Member {

    public static void main(String[] args) {
        int[] v = {2, 3, 7, 9, 11, 13, 17, 37, 73};
        System.out.println(member(v, 11));
    }

    // Given an array v and a number n, computes and returns if n appears in v.
    public static boolean member(int[] v, int n) {
        boolean isMember = false;
        int i = 0;
        while(i < v.length && !isMember) {
            if(v[i] == n) {
                isMember = true;
            }
            System.out.println(i);
            i = i + 1;
        }

        return isMember;
    }
}
