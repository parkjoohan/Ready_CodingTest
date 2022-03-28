import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 0; //당첨번호와 비교해 일치하는 번호 개수 cnt
        int zeroCnt = 0; //동생 낙서로 알아보지 못하는 번호 개수 zeroCnt
    
    for(int lotto: lottos) { //민우의 로또번호 반복문으로 하나씩 돌리기
        if(lotto == 0) { //로또번호가 0이면 
            zeroCnt ++; //zeroCnt 1씩 증가시키기
            continue; //바로 다음 로또번호 검색하도록 continue
        } 
        //만약 로또번호가 0이 아니면
        for(int win_num: win_nums) { //당첨번호와 민우 로또번호를 비교해 
            if(win_num == lotto){ //서로 일치하면
                cnt ++; //cnt를 1씩 증가시켜줌
                break; //다음 번호를 비교하기 위해 빠져나옴
            }
        }
    }
    return new int[]{7-Math.max(cnt+zeroCnt,1),7-Math.max(cnt,1)};
    
}
}