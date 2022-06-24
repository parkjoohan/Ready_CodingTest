class Solution {
    static int n, zero=0, one=0;
    static int[][] map;
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        map = new int[arr.length][arr.length];
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                map[i][j]=arr[i][j];
            }
        }
        
        func(0,0,arr.length);
        
        answer[0]=zero;
        answer[1]=one;
        
        return answer;
    }
    
    public static void func(int x, int y, int n){
        int cnt=0;
        
        // 전체 영역이 1로 가득 차있는지 확인
        for(int i=x; i<x+n; i++){
            for(int j=y; j<y+n; j++){
                if(map[i][j]==1)
                    cnt++;
            }
        }
        
        // 압축, 모든 영역이 0이라면,
        if(cnt==0)  zero++;
        
        //압축, 모든 영역이 1이라면,
        else if(cnt==n*n)   one++;
        
        // 그렇지 않다면 분할
        else {
            func(x,y,n/2);
            func(x,y+n/2,n/2);
            func(x+n/2,y,n/2);
            func(x+n/2,y+n/2,n/2);
        }
    }
}