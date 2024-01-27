import java.util.ArrayList;
import java.util.Scanner;

public class SuperPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> superPrimes = superPrimeNumber(n);

        for (int prime : superPrimes) {
            System.out.print(prime + " ");
        }
    }

    public static ArrayList<Integer> superPrimeNumber(int n) {
        ArrayList<Integer> primes = sieveOfEratosthenes(n);
        ArrayList<Integer> superPrimes = new ArrayList<>();

        for (int prime : primes) {
            if (isPrime(prime)) {
                superPrimes.add(prime);
            }
        }

        return superPrimes;
    }

    public static ArrayList<Integer> sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
