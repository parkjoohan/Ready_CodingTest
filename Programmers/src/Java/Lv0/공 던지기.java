package Java.Lv0;

class Solution {
    public int solution(int[] numbers, int k) {
        int num = 2 * (k-1);
        
        while(true) {
            if(num > numbers.length) 
                num -= numbers.length;
            else
                break;
        }
        
        return numbers[num];
    }
}