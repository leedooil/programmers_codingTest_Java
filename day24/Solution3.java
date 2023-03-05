package day24;

import java.util.Arrays;

public class Solution3 {
	public int solution(String before, String after) {
        
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        String beforeStr = new String(beforeArr);
        String afterStr = new String(afterArr);
        
        if (beforeStr.equals(afterStr)) {
			return 1;
		}else {
			return 0;
		}
    }
}