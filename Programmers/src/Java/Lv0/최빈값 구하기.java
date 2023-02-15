class Solution {
    public int solution(int[] array) {
        int[] arr = new int[1000];
        int answer = 0;
        int max = 0;
        
        for(int i=0; i<array.length; i++) {
            arr[array[i]]++;
            
            if(arr[array[i]]>max) {
                max = arr[array[i]];
                answer = array[i];
            }
        }
        
        int cnt = 0;
        for(int i=0; i<arr.length; i++) {
            if(max == arr[i])   cnt++;
            if(cnt>1)   answer = -1;
        }
        
        return answer;
    }
}