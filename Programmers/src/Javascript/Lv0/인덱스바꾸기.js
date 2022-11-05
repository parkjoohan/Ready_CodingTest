function solution(my_string, num1, num2) {
    var answer = '';
    let str = my_string.split("");
    let array = [];
    let tmp = 0;
    
    for(let i=0; i<str.length; i++)
        array.push(str[i]);
    
    tmp = array[num1];
    array[num1] = array[num2];
    array[num2] = tmp;
    
    for(let i=0; i<array.length; i++)
        answer += array[i];
    
    return answer;
}