package algorithms.math;

/**
 * Created by ovidi
 */
public class SieveOfEratosthenes {

    private static int[] GetSieve(int n){
        int[] sieve = new int[n + 1];

        for(int i = 2; i <= n; i++){
            if(sieve[i] != 0){
                continue;
            }

            for(int j = 2*i; j < n; j += i){
                sieve[j] = i;
            }
        }

        return sieve;
    }

    public static void main(String[] args) {

        int n = 13;
        int[] sieve = GetSieve(n);
        for(int i = 2; i <= n; i++){
            System.out.printf("%d %d\n", i, sieve[i]);
        }
    }

}
