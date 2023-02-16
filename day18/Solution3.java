package day18;

public class Solution3 {
	public int solution(int n, int t) {
        int answer = 0;
        
        answer = (int) Math.pow(2, t) * n;
        
        return answer;
    }
}