function solution(clothes) {
    var answer = 1;
    const obj = {};
    
    clothes.map(cloth => {
        if(obj[cloth[1]])  return obj[cloth[1]] += 1;
        return obj[cloth[1]]=1;
    });
    
    const keys = Object.keys(obj);
    keys.forEach(key => {
        answer *= obj[key] + 1;
    })
    
    return answer - 1;
}
