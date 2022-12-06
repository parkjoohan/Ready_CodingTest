function solution(ingredient) {
    var answer = 0;
    let arr = [];
    
    ingredient.forEach((item, idx) => {
        arr.push(item);
        
        if(arr.length>=4) {
            let array = arr.slice(-4).join("");
            if(array === '1231'){
                arr.pop();
                arr.pop();
                arr.pop();
                arr.pop();
                answer++;
            }
        }
    })
    
    return answer;
}