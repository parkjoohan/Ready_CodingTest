function solution(money) {
    var answer = [];
    
    let time = (parseInt)(money/5500);
    answer.push(time);
    answer.push(money - time * 5500);
    
    return answer;
}