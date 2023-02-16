package day18;

import java.util.Arrays;

public class Solution4 {
	public String solution(String my_string) {
        
		String answer = "";
		
        my_string = my_string.toLowerCase();
                
        char[] charArr = my_string.toCharArray();
        
        Arrays.sort(charArr);
        
        for (int i = 0; i < charArr.length; i++) {
			answer += charArr[i];
		}
        
        return answer;
    }
}