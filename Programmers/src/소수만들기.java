class Solution {
    public int solution(int[] nums) {
        int answer=0;
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    answer += isPrime(sum) ? 1 : 0;
                }
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
}

// javascript
//function solution(nums) {
//    var answer = 0;
//    
//    for(let i=0; i<nums.length-2; i++){
//        for(let j=i+1; j<nums.length-1; j++){
//            for(let k=j+1; k<nums.length; k++){
//                if(isPrime(nums[i] + nums[j] + nums[k])) {
//                  answer++;
//                }
//            }
//        }
//    }
//    return answer;
//}
//
//const isPrime = (num) => {
//    for(let i=2; i<=Math.sqrt(num); i++){
//        if(num % i == 0)    return false;
//    }
//    return true;
//}