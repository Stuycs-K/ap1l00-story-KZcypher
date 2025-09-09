public class HelloWorld {
    public static boolean isPrime(int x) {
        int divisor = x - 1;
        if (divisor == 1)
        return true;
        if (divisor < 1)
        return false;
        while (divisor != 1) {
            if (x % divisor == 0)
            return false;
            divisor--;
        }
        return true;
    }
    public static int nthPrime(int n) {
        int primeCount = 0;
        int num = 2; 
        while (primeCount != n) {
            num++;
            if (isPrime(num))
            primeCount++;
        }
        return num;
    }
    public static void main(String[] args) {
    int[] primes = {
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
        31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
        73, 79, 83, 89, 97, 101, 103, 107, 109, 113,
        127, 131, 137, 139, 149, 151, 157, 163, 167, 173,
        179, 181, 191, 193, 197, 199, 211, 223, 227, 229
    };
    for (int i = 0; i < primes.length; i++) {
        if (nthPrime(i) == primes[i])
        System.out.println("pass");
        else
        System.out.println("fail expected " + primes[i] + ", but value returned was " + nthPrime(i));
    }
    }
}
    
