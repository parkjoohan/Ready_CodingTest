function solution(array, n) {
    let answer = array[0];
    
    for(const num of array) {
        if (Math.abs(answer - n) > Math.abs(num - n)) {
            answer = num;
        } else if (Math.abs(answer -n) === Math.abs(num - n)) {
            answer = Math.min(answer, num);
        }
    }
    
    return answer;
}