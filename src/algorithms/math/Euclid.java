package algorithms.math;

/**
 * Created by ovidiup13
 */
public class Euclid {

    /**
     * O(log n), worst case when a and b are consecutive Fibonacci numbers.
     */
    private static int Gcd(int a, int b){
        if(b == 0){
            return a;
        }

        return Gcd(b, a % b);
    }

    private static int Lcm(int a, int b){
        return (a * b) / Gcd(a,b);
    }

    public static void main(String[] args) {
        int a = 183;
        int b = 36;

        System.out.println(Gcd(a, b));
        System.out.println(Lcm(a, b));

    }

}
