package day15;

public class Solution2 {
	public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] strArr = my_string.toCharArray();
        
        char temp = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = temp;
        
        for (int i = 0; i < strArr.length; i++) {
			answer += strArr[i];
		}
        
        return answer;
    }
}