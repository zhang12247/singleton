package ValidParentheses;

import java.util.Stack;

public class Vaildparentless {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char a : s.toCharArray()) {
            switch (a) {
                case '{':
                    stack.push('}');
                    break;
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '}':
                    if(!stack.empty() && a==stack.pop()){
                        break;
                    }else{
                        return false;
                    }
                case ')':
                    if(!stack.empty() && a==stack.pop()){
                        break;
                    }else{
                        return false;
                    }
                case ']':
                    if(!stack.empty() && a==stack.pop()){
                        break;
                    }else{
                        return false;
                    }
                default:
                    break;
            }

        }
        if(!stack.empty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        isValid("]");
    }

}
