package data_structures.strings;


public class Roman2Integer {

    public int romanToInt(String a) {

        int n = a.length();
        if(n == 0){
            return 0;
        }

        int value = 0;

        for(int i = 0; i < n; i++){
            int val = getValue(a.charAt(i));
            if(i == n - 1 || val >= getValue(a.charAt(i+1))){
                value += val;
            } else {
                value -= val;
            }
        }

        return value;
    }

    private int getValue(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }


    public static void main(String[] args) {
        Roman2Integer r2i = new Roman2Integer();
        String s = "MXLIV";
        System.out.println(r2i.romanToInt(s)); // 1044
    }



}
