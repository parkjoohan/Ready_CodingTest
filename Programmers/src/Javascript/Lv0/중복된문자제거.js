function solution(my_string) {
    var answer = '';
    let array = [];
    let str = my_string.split("");
    
    for(let i=0; i<str.length; i++){
        if(array.includes(str[i])==false)
            array.push(str[i]);
    }
    
    for(let i=0; i<array.length; i++)
        answer += array[i];
    
    return answer;
}