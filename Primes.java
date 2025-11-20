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
        // Assume args[0] is successfully parsed as an integer (e.g., 100)
        int n = Integer.parseInt(args[0]);
        int count = 0;

        System.out.println("Prime numbers up to " + n + ":");
        
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
       
       // Calculate the percentage of primes
       int percentage = count * 100 / n;
       
       // Corrected output line to match the expected format exactly, 
       // replacing the likely encoded %25 with a literal %.
       System.out.println( "There are " + count + " primes between 2 and " + n + " (" + percentage + "% are primes)");
    }
}