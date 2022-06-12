//import java.util.*;
//
//class Solution {
//    public String solution(String s) {
//        String answer = "";
//        
//        String s2 = s.toLowerCase();
//        char last = ' ';
//        
//        for(char c : s2.toCharArray()){
//            if(last == ' ') c = Character.toUpperCase(c);
//            answer += c;
//            last = c;
//        }
//        
//        return answer;
//    }
//}

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        
        boolean blank = true;
        
        for(String i : arr){
            answer += blank ? i.toUpperCase() : i;
            blank = i.equals(" ") ? true : false;
        }
        
        return answer;
    }
}