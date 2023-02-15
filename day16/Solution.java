package day16;

public class Solution {
	public int solution(String message) {
        int answer = 0;
        
        char[] charArr = message.toCharArray();
        
        answer = charArr.length * 2;
        
        return answer;
    }
}