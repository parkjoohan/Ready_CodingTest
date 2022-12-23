function solution(cacheSize, cities) {
    let queue = [];
    let answer = 0;
    
    // 대문자로 변환
    let bigCities = cities.map(v => v.toUpperCase());
    
    // 도시 배열이 없을 때
    if(cities.length === 0) return 0;
    
    // 캐시가 0일 경우 도시의 실행시간은 *5
    if(cacheSize === 0) return cities.length*5;
    
    for(let i=0; i<bigCities.length; i++) {
        // 큐가 캐시 사이즈보다 작을 경우
        if(queue.length < cacheSize) {
            if(queue.indexOf(bigCities[i]) >= 0){
                answer++;
                queue.push(queue.splice(queue.indexOf(bigCities[i]),1)[0]);
            } else {
                queue.push(bigCities[i])
                answer+=5;
            }
        } else {
            if(queue.indexOf(bigCities[i]) >= 0){
                answer++;
                queue.push(queue.splice(queue.indexOf(bigCities[i]),1)[0]);
            } else {
                answer+=5;
                queue.shift();
                queue.push(bigCities[i]);
            }
        }
    }
    
    return answer;
}