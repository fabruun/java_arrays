public class ArrayDivisors {

	public static void main(String[] args) {
		System.out.println(toString(getDivisors(73)));
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
	 * Takes a number called n, counts the number the divisors
	 * of that number n, this is the size of an array which then
	 * returns the divisors of that number n.
	*/
	public static int[] getDivisors(int n) {
		int i = 0;
		int size = 0;


		while(i < n) {
			i = i + 1;
			if(n % i == 0) {
				size = size + 1;
			}
		}

		int[] divisors = new int[size];
		int j = 0;
		int index = 0;
		while(j < n) {
			j = j + 1;
			if(n % j == 0) {
				divisors[index] = j;
				index = index + 1;
			}
		}

		return divisors;
	}
}
