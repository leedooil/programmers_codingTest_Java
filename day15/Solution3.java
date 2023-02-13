package day15;

import java.util.Arrays;

public class Solution3 {
	public String solution(String s) {
        String answer = "";
        
        char[] strArr = s.toCharArray();
        
        Arrays.sort(strArr);
        
        int[] index = new int[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
        	int count = 0;
			for (int j = 0; j < strArr.length; j++) {
				if (strArr[i] == strArr[j]) {
					count++;
				}
				index[i] = count;
			}
		}
        
        for (int i = 0; i < index.length; i++) {
			if (index[i] == 1) {
				answer += strArr[i];
			}
		}
        
        return answer;
    }
}