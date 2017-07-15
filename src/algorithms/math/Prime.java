package algorithms.math;


public class Prime {

    private static boolean IsPrime(int n){
        if(n < 2){
            return false;
        }

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println(IsPrime(n));
    }

}
