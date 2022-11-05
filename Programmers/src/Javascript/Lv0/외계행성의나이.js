function solution(age) {
    let result = "";
    let str = String(age).split("");
    let age_list = ["a","b","c","d","e","f","g","h","i","j"];
    
    for(let i = 0; i < str.length; i++){
        let index = Number(str[i]);
        
        result += age_list[index];
    }
    
    return result
}