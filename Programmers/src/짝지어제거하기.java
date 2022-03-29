import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(!stack.isEmpty() && ch == stack.peek())
                stack.pop();
            else
                stack.add(ch);
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}