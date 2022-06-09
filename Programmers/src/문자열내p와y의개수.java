class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char ch=' ';
        int cnt1=0, cnt2=0;

        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            
            if(ch=='p' || ch=='P')
                cnt1++;
            else if(ch=='y' || ch=='Y')
                cnt2++;
        }
        
        if(cnt1!=cnt2)
            answer = false;

        return answer;
    }
}

//class Solution {
//    boolean solution(String s) {
//        int cnt=0, cnt2=0;
//        
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
//                cnt++;
//            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
//                cnt2++;
//        }
//        
//        if(cnt == cnt2) return true;
//        else if(cnt != cnt2)    return false;
//        else    return true;
//    }
//}