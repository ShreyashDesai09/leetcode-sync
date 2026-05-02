// LeetCode: 20. Valid Parentheses
import java.util.*;

class _20_valid_parentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0) return false;

        for(int i = 0 ; i < s.length (); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '['|| s.charAt(i) == '{')
            {    
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}')
            {

                if(stack.isEmpty()) return false;

                if(stack.peek() == '(' && s.charAt(i) == ')')
                    stack.pop();
                else if(stack.peek() == '[' && s.charAt(i) == ']')
                    stack.pop();
                else if(stack.peek() == '{' && s.charAt(i) == '}')
                    stack.pop();
                else 
                    return false;
            }

        }   

        if(stack.isEmpty())
            return true;
        else
            return false;


    }
}
