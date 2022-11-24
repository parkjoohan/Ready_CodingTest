// function solution(a, b) {
//     var answer = '';
//     let day = ["SUN","MON","TUE","WED","THU","FRI","SAT"];
//     let num = [0,31,29,31,30,31,30,31,31,30,31,30,31];
//     let sum = 0;
    
//     for(let i=1; i<a; i++){
//         sum += num[i];
//     }
//     sum += b-1;
    
//     answer = day[(5+sum)%7];
    
//     return answer;
// }

function solution(a, b) {
    let date = new Date(2016, (a-1), b);
    return date.toString().slice(0,3).toUpperCase();
}