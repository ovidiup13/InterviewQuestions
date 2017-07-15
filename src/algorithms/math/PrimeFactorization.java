package algorithms.math;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    private static List<Integer> GetFactorization(int n){
        List<Integer> factors = new ArrayList<>();

        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                factors.add(i);
                n /= i;
            }
        }

        // n is prime
        if(n > 1){
            factors.add(n);
        }

        return factors;
    }

    public static void main(String[] args) {
        int n = 441;
        List<Integer> factors = GetFactorization(n);
        factors.forEach(System.out::println);
    }

}
