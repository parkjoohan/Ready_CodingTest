function solution(my_string) {
    let answer = my_string.toLowerCase();
    let str = answer.split("");
    let array = [];
    let result = "";
    
    for(let i=0; i<str.length; i++)
        array.push(str[i]);
    
    array.sort(function(a,b){
        if (a > b) return 1;
        else if (b > a) return -1;
        else return 0;
    });
    
    for(let i=0; i<array.length; i++)
        result += array[i];
    
    return result;
}