class Solution {
    public long solution(int price, int money, int count) {
        long result = 0, sum = 0;
        
        for(int i=1; i<=count; i++) {
            sum += price * i;
        }

        result = sum - money;
        if(result <= 0) return 0;
        return result;
    }
}