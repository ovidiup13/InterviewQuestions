package algorithms.time;


import java.util.stream.IntStream;

public class MissingElement {

    public static int findElement(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        long sum = IntStream.of(A).sum();
        long ideal = ((n + 1) * (n + 2)) / 2;
        return (int)(ideal - sum);
    }

    public static void main(String[] args) {
        System.out.println(findElement(new int[]{}));
    }

}
