package day05;

public class Solution3 {
	public int solution(int age) {
        int answer = 0;
        final int STANDARD = 2022; 
        answer = (STANDARD - age) + 1;
        return answer;
    }
}