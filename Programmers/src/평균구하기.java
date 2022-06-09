class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum=0;
        
        for(int i : arr){
            sum += i;    
        }
        
        answer = sum / arr.length;
        
        return answer;
    }
}

// javascript
//function solution(arr) {
//    var answer = 0;
//    let sum = 0;
//    
//    for(let i=0; i<arr.length; i++){
//        sum += arr[i];
//    }
//    
//    return answer = sum / arr.length;
//}