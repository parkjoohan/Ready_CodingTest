function solution(spell, dic) {
    let answer = [];
    
    dic.forEach((word) => {
        let cnt = 0;
        
        spell.forEach((item) => {
            if(word.includes(item))
                cnt++;
        })
        
        if(cnt === spell.length)
            answer.push(word);
    })
    
    return answer.length === 0 ? 2 : 1;
}