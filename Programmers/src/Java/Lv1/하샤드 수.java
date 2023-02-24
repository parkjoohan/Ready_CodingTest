class Solution {
    public boolean solution(int x) {
        int arr = x;
        int sum = 0;
        
        while(arr>0) {
            sum += arr%10;
            arr/=10;
        }
        
        if(x%sum==0)
            return true;
        else
            return false;
    }
}