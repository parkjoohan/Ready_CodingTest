import java.util.*;

class Solution {
    public int[][] map;
    public ArrayList<Integer> answer;
    public int[] solution(int rows, int columns, int[][] queries) {
        answer = new ArrayList<Integer>();
        map = new int[rows+1][columns+1];
        int temp=1;
        
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=columns; j++){
                map[i][j] = temp;
                temp++;
            }
        }
        
        for(int i=0; i<queries.length; i++){
            answer.add(rotate(queries[i]));
        }
        
        return answer.stream().mapToInt(x->x).toArray();
    }
    
    public int rotate(int[] query){
        int startX = query[0];
        int startY = query[1];
        int endX = query[2];
        int endY = query[3];
        
        // 마지막 블록은 켭치게 되므로 마지막 턴은 제외
        int prev = map[startX][startY];
        int min = prev;
        
        // 오른쪽 이동
        for(int i = startY+1; i <= endY; i++){
            int temp = map[startX][i];
            map[startX][i] = prev;
            min = Math.min(prev, min);
            prev = temp;
        }
        
        // 아래 이동
        for(int i = startX+1; i <= endX; i++){
            int temp = map[i][endY];
            map[i][endY] = prev;
            min = Math.min(prev, min);
            prev = temp;
        }
        
        // 왼쪽 이동
        for(int i = endY-1; i >= startY; i--){
            int temp = map[endX][i];
            map[endX][i] = prev;
            min = Math.min(prev, min);
            prev = temp;
        }
        
        // 위로 이동
        for(int i = endX-1; i >= startX; i--){
            int temp = map[i][startY];
            map[i][startY] = prev;
            min = Math.min(prev, min);
            prev = temp;
        }
        
        return min;
    }
}