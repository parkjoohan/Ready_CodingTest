function solution(a, b) {
    let answer = '';
    let days = ["FRI","SAT","SUN","MON","TUE","WED","THU"];
    let month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    let sum = 0;
    
    for(let i=0; i<a-1; i++)
        sum += month[i];
    
    sum+=(b-1);
    answer = days[sum%7];
    
    return answer;
}