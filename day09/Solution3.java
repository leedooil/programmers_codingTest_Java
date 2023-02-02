package day09;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
	public String solution(String rsp) {
        String answer = "";
        
        Map win = new HashMap();
        win.put('2', '0');
        win.put('0', '5');
        win.put('5', '2');
        
        char[] rspArr = rsp.toCharArray();
		for (char arr : rspArr) {
			answer += win.get(arr);
		}
		
        return answer;
    }
}