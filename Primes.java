public class Primes {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count ++;
            }
        }
       System.out.println( "There are " + count + " primes between 2 and 7");
    }
}