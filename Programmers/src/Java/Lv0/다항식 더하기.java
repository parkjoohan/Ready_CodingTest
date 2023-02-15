class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" +");
        int sum1 = 0, sum2 = 0;
        
        for(String s : arr) {
            if(s.equals("x"))
                sum1 += 1;
            else if(s.contains("x"))
                sum1 += Integer.parseInt(s.substring(0, s.length()-1));
            else if(!s.equals("+"))
                sum2 += Integer.parseInt(s);
        }
        
        if(sum1!=0 && sum2==0) {
            if(sum1==1)
                answer += "x";
            else
                answer += sum1 + "x";
        }
        
        if(sum1!=0 && sum2!=0) {
            if(sum1==1)
                answer += "x" + " + " + sum2;
            else
                answer += sum1 + "x" + " + " + sum2; 
        }
        
        if(sum1==0 && sum2!=0)
            answer += sum2;
        
        return answer;
    }
}