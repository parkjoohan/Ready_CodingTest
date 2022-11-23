// function solution(s) {
//     return s.split(" ").map((x) => x.split("").map((y,index) => (index%2==0 ? y.toUpperCase() : y.toLowerCase())).join("")).join(" ");
// }

function solution(s) {
    var answer = '';
    let words = s.split(" ");
    
    for(let i=0; i<words.length; i++){
        for(let j=0; j<words[i].length; j++){
            if(j%2 === 0)
                answer += words[i][j].toUpperCase();
            else
                answer += words[i][j].toLowerCase();
        }
        
        if(i<words.length-1)
            answer += " ";
    }
    
    return answer;
}