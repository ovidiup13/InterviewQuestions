package data_structures.arrays;

import java.math.BigInteger;

/**
 * A robot is located at the top-left corner of an A x B grid.
 *
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked ‘Finish’ in the diagram below).
 *
 * How many possible unique paths are there?
 *
 * Note: A and B will be such that the resulting answer fits in a 32 bit signed integer.
 */
public class UniquePaths {

    public int uniquePaths(int a, int b) {
        if (a == 1 || b == 1) {
            return 1;
        }

        // System.out.printf("%d %d\n", a, b);
        BigInteger x = factorial(a + b - 2);
        BigInteger y = factorial(a - 1);
        BigInteger z = factorial(b - 1);
        // System.out.printf("%d, %d, %d\n", x, y, z);

        return x.divide(y.multiply(z)).intValue();
    }

    private BigInteger factorial(int n) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
            // System.out.println("I is: " + i);
            // System.out.println("Result is: " + result);
        }

        return result;
    }
}
