import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 문자열 회전 코드
        for(int i=0; i<s.length(); i++){
            String movedStr = s.substring(i)+s.substring(0,i);
            if(check(movedStr.toCharArray())){
                answer+=1;
            }
        }
        
        return answer;
    }
    
    public boolean check(char[] strArr){
        // 첫번째 글자가 ],),} 경우 무조건 false
        if(strArr[0] == ']' || strArr[0] == ')' || strArr[0] == '}') 
            return false;
        
        Stack<Character> stack = new Stack<>();
        for(char ch : strArr){
            // [,(,{ 경우 stack에 삽입
            if(ch == '[' || ch == '(' || ch == '{') 
                stack.push(ch);
            
            else {
                // ],),} 경우 stack size 여부 확인
                if(!stack.isEmpty()){
                    // 괄호 조합
                    String temp = String.valueOf(stack.peek()+String.valueOf(ch));
                    
                    if (temp.equals("[]") || temp.equals("()") || temp.equals("{}")) 
                        stack.pop();
                    else 
                    	// 괄호 조합이 어긋날 경우 남은 글자를 조합해도 완전한 괄호를 가질 수 없음
                        return false;
                } 
                else
                    return false;
            }
        }
        
        if(!stack.isEmpty())
            return false;
        
        return true;
    }
}


//import java.util.*;
//
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        
//        for(int i=0; i<s.length(); i++){
//            Stack<String> st = new Stack<>();
//            s = s.substring(1, s.length())+s.substring(0,1);
//            
//            for(int j=0; j<s.length(); j++){
//                String word = s.substring(j, j+1);
//                if(st.isEmpty()){
//                    st.push(word);
//                    continue;
//                }
//                
//                if(word.equals(")") && st.peek().equals("(")){
//                    st.pop();
//                } else if(word.equals("}") && st.peek().equals("{")){
//                    st.pop();
//                } else if(word.equals("]") && st.peek().equals("[")){
//                    st.pop();
//                } else {
//                    st.push(word);
//                }
//            }
//            
//            if(st.isEmpty()){
//                answer++;
//            }
//        }
//        return answer;
//    }
//}