function solution(cipher, code) {
    var answer = '';
    let str = cipher.split("");
    
    for(let i=code-1; i<cipher.length; i+=code){
        answer += str[i];
    }
    
    return answer;
}