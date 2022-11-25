function solution(food) {
    let answer = [];
    
    food.forEach((item, index) => {
        if(item>=2) {
            let time = Math.floor(item/2);
            answer.push(String(index).repeat(time));
        }
    })
    
    let result = [answer.join(""),0,answer.reverse().join("")];
    
    return result.join("");
}