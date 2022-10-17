function solution(babbling) {
    let answer = 0;
    
    babbling.forEach((word) => {
        if(word.split(/aya|ye|woo|ma/g).join('') === '')
            answer++;
    });
    
    return answer;
}