function solution(s) {
    var answer = [];
    let strList = s.replace('{{','').replace('}}','').split('},{');
    let setList = [];
    
    for(let i=0; i<strList.length; i++)
        setList.push(strList[i].split(','));
    
    // 크기 순으로 배열 정렬
    setList.sort((a,b) => {
        if(a.length>b.length)
            return 1;
        else
            return -1;
    })
    
    // 첫번째 요소 answer에 저장
    answer.push(parseInt(setList[0][0]));
    
    // 각 배열의 요소 중에 answer에 없는 요소를 찾고 answer에 저장
    for(let i=1; i<setList.length; i++) {
        let element = getElement(setList[i], answer);
        answer.push(element);
    }
    
    return answer;
}

function getElement(set, answer) {
    //set과 answer의 모든 요소를 비교해서 answer에 없는 set요소를 찾기
    for(let i=0; i<set.length; i++) {
        for(let j=0; j<answer.length; j++) {
            set = set.filter(element => element!=answer[j]);
        }
    }
    
    return parseInt(set[0]);
}