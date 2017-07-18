package algorithms.bit;

/**
 * Reverse bits of an 32 bit unsigned integer.
 * <p>
 * Have to use long in java as there is no unsigned int.
 */
public class ReverseBits {

    public long reverse(long a) {

        long result = 0;
        int i = 31;

        while (a > 0) {
            result += (a % 2) * Math.pow(2, i);
            i--;
            a = a / 2;
        }

        return result;
    }

}
