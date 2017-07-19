package algorithms.binary_search;


public class SquareRoot {

    public int sqrt(int a) {

        if (a == 0 || a == 1) {
            return a;
        }

        long low = 0;

        //square root cannot be higher than a/2
        long high = a / 2 + 1;

        while (low <= high) {

            long mid = (high + low) / 2;
            long square = mid * mid;

            if (square == a) {
                return (int) mid;
            }

            if (square < a) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) high;
    }

}
