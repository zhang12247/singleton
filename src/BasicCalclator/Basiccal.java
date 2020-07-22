package BasicCalclator;

import java.util.Stack;

public class Basiccal {
    public static int calculate(String s) {
        Stack<Character> stack = new Stack<>();
        int sum = 0;
        char tmp = 0;
        String length = "";
        for (char a : s.toCharArray()) {
            switch (a) {
                case '(':
                    break;
                case ')':
                    break;
                case ' ':
                    break;
                case '+':
                    if(!length.equals("")){
                        if(tmp == '-'){
                        sum -= Integer.valueOf(length);
                        length = "";
                        }else{
                            sum += Integer.valueOf(length);
                            length = "";
                        }
                        tmp = '+';
                    }
                    break;
                case '-':
                    if(!length.equals("")){
                        if(tmp == '-'){
                            sum -= Integer.valueOf(length);
                            length = "";
                        }else{
                            sum += Integer.valueOf(length);
                            length = "";
                        }
                        tmp = '-';
                    }
                    break;
                default:
                    length += a;
                    break;
            }


        }
        if(!length.equals("")){
            if(tmp == '+' || tmp == 0){
            sum+= Integer.valueOf(length);}
            else {
                sum-= Integer.valueOf(length);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        calculate("2-(5-6)");
    }

}
