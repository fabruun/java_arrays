public class Eratosthenes {

    public static void main(String[] args) {
        System.out.println(toString(eratosthenes(73)));
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

    private static boolean checkPrime(int n) {
		int i = 2;
		boolean isPrime = true;
		while(i < n) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
			i = i + 1;
		}

		return isPrime;
	}

	private static int countPrimes(int n) {
		int i = 2;
		int primes = 0;
		while(i < n) {
			if(checkPrime(i)) {
				primes = primes + 1;
			}
			i = i + 1;
		}

		return primes;
	}

    /*
    * Given a number, uses the Sieve of Eratosthenes Algorithm to compute
    * and return an array with all primes from 2 to the number n.
    */
    public static int[] eratosthenes(int n) {
        int i = 2;
        int size = 0;
        while(i <= n) {
            if(checkPrime(i) == true) {
                size = size + 1;
            }
            i = i + 1;
        }

        System.out.println(size);
        int[] primes = new int[size];
        int index = 0;
        int j = 2;
        while(j <= n) {
            if(checkPrime(j) == true) {
                primes[index] = j;
                index = index + 1;
            }

            j = j + 1;
        }
        return primes;
    }
}
