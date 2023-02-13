package day14;

public class Solution3 {
	public String solution(String cipher, int code) {
        String answer = "";
        
        char[] arr = cipher.toCharArray();
        
        for (int i = 1; i < arr.length + 1; i++) {
        	if (i % code == 0) {
        		answer += arr[i-1];
			}
        	
        	if (code > arr.length) {
        		break;
			}
        	
		}
        
        return answer;
    }
}