function solution(my_string) {
    var answer = my_string;
    let array = ["a","e","i","o","u"];
    
    for(let i=0; i<array.length; i++){
        answer = answer.replaceAll(array[i], "");
    }
    
    return answer;
}