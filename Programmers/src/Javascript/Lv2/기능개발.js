function solution(progresses, speeds) {
    var answer = [];        // answer: 각 배포마다 배포되는 기능의 수가 적힌 정수 배열
    let days = 1;           // days: 배포일
    let cnt = 0;            // cnt: 오늘 배포되는 기능의 수
    let progress = 0;       // progress: 현재 기능의 작업 진도
    
    // 모든 작업이 다 배포될 때까지 반복
    while(progresses[0]){
        progress = progresses[0] + (speeds[0] * days);      // 첫 번째 기능의 작업 진도
        
        // 첫 번째 기능의 작업 진도가 100 이상인 경우 배포 완료
        if(progress >= 100){
            cnt++;                  // 배포 완료된 기능 개수 추가
            progresses.shift();     // 배포 완료된 작업 제거
            speeds.shift();         // 배포 완료된 작업의 속도 제거
        } else {
            if(cnt > 0)
                answer.push(cnt);   // 배포 완료된 기능이 있는 경우, answer에 push
            
            days++;                 // 배포일 증가 (다음날)
            cnt = 0;                // 배포 완료된 기능 개수 초기화
        }
    }
    
    // 모든 작업이 다 배포되고 나면, 마지막으로 카운트된 배포 완료 기능 개수 push
    answer.push(cnt);
    
    return answer;
}