package data_structures.strings;


public class CountAndSay {

    public static void main(String[] args) {
        int n = 2;

        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int a) {

        if(a == 0){
            return "";
        }
        if(a == 1){
            return "1";
        }

        String result = "1";
        for(int i = 0; i < a; i++){
            result = count(result);
            System.out.println(result);
        }

        return result;
    }

    public static String count(String as){

        char[] chars = as.toCharArray();
        StringBuilder s = new StringBuilder();

        int count = 1;

        //System.out.println(chars);
        for(int i = 1; i < as.length(); i++){
            //if same as previous, increment count
            if(chars[i] == chars[i-1]){
                count++;
            }
            else{
                s.append(count).append(chars[i-1]);
                count = 1;
            }
        }

        s.append(count);
        s.append(as.charAt(as.length() - 1));

        return s.toString();

    }
}
