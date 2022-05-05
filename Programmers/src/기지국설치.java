// 첫번째 위치부터 시작
// 1. 기지국 범위 밖에 있으면, 현재 위치를 포함할 수 있는 가장 먼 곳에 기지국을 설치 후
//    설치한 기지국 밖으로 이동
// 2. 기지국 범위 안에 있으면, 해당 기지국의 범위 밖으로 이동
// 3. 현재 위치가 모든 기지국을 지나쳤다면, 그 다음부터는 기지국을 계속 설치해나간다.
//    기지국 배열 길이 넘어가는 순간부터 그리디를 적용하여 설치 진행

class Solution {
    public int solution(int n, int[] stations, int w) {
        int now = 1;    // 현재 위치
        int station = 0;    // 기지국 idx
        int answer = 0;

        // 현재 위치가 범위 이내인 경우 순회
        while(now<=n){
            // 현재 위치가 모든 기지국 범위 넘어선 경우 || 현재 위치가 기지국의 범위보다 작은 경우
            if(stations.length <= station || now < stations[station]-w){
                // now + w에 설치한다고 가정
                answer++;
                // now를 새로 설치한 기지국의 범위 밖으로 이동
                now = now + 2 * w + 1;
            }
            // 현재 위치가 모든 기지국의 범위보다 작으며 특정 기지국의 범위 내에 있는 경우
            else {
                // 현재 위치를 기지국 밖으로 이동
                now = stations[station] + w + 1;
                // 계산할 기지국을 다음 기지국으로 변경
                station++;
            }
        }

        return answer;
    }
}