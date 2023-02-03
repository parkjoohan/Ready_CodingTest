package Java.Lv0;

import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] array1 = before.toCharArray();
        char[] array2 = after.toCharArray();
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        String str1 = new String(array1);
        String str2 = new String(array2);
        
        if(str2.equals(str1))
            return 1;
        else
            return 0;
        
    }
}