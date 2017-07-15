package algorithms.math;

public class NumberSystems {

    private static int toBase10(String n, int base){
        if(base < 2 || base > 16){
            return -1;
        }

        int value = 0;
        for(int i = 0; i < n.length(); i++){
            int digit = digitToValue(n.charAt(i));
            if(digit < 0 || digit > base){
                return -1;
            }

            int exp = n.length() - 1 - i;
            value += digit * Math.pow(base, exp);
        }

        return value;
    }

    private static int digitToValue(char c){
        return Character.getNumericValue(c);
    }


    public static void main(String[] args) {
        String n = "0110";
        int base = 2;
        System.out.println(toBase10(n, base));
    }
}
