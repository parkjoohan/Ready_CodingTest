// function solution(nums) {
//     var answer = [];
//     let max = nums.length/2;
    
//     for(let i=0; i<nums.length; i++){
//         if(answer.length < max) {
//             if(!answer.includes(nums[i]))
//                 answer.push(nums[i]);
//         }
//     }
    
//     return answer.length;
// }

function solution(nums) {
    let answer = [...new Set(nums)];
    let limit = nums.length/2;
    
    return answer.length > limit ? limit : answer.length;
}