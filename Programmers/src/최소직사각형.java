class Solution {
    public int solution(int[][] sizes) {
        int max_width = 0;
        int max_height = 0;
        int answer = 0;
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>=sizes[i][1]){
                max_width = Math.max(sizes[i][0], max_width);
                max_height = Math.max(sizes[i][1], max_height);
            }else{
                max_width = Math.max(sizes[i][1], max_width);
                max_height = Math.max(sizes[i][0], max_height);
            }
        }
        answer = max_width * max_height;
        return answer;
    }
}

//// javascript
//function solution(sizes) {
//    var answer = 0;
//    let tmp = 0;
//    let max_x = 0, max_y=0;
//    
//    for(let i=0; i<sizes.length; i++){
//        if(sizes[i][0] < sizes[i][1]){
//            tmp = sizes[i][0];
//            sizes[i][0] = sizes[i][1];
//            sizes[i][1] = tmp;
//        }
//    }
//    
//    for(let i=0; i<sizes.length; i++){
//        max_x = Math.max(max_x, sizes[i][0]);
//        max_y = Math.max(max_y, sizes[i][1]);
//    }
//    
//    answer = max_x * max_y;
//    
//    return answer;
//}