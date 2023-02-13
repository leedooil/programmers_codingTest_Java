package day14;

public class Solution4 {
	public String solution(String my_string) {
        String answer = "";
        
        char[] strArr = my_string.toCharArray();
        
        for (int i = 0; i < strArr.length; i++) {
        	if (Character.toUpperCase(strArr[i]) == (strArr[i])) {
				strArr[i] = Character.toLowerCase(strArr[i]);
			}else {
				strArr[i] = Character.toUpperCase(strArr[i]);
			}
        	
			answer += strArr[i];
		}
        
        return answer;
    }
}