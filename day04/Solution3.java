package day04;

public class Solution3 {
	public int solution(int slice, int n) {
		int answer = 0;
		int pizza = 0;
		answer = (n / slice);
		if ((n % slice) != 0) {
			answer++;
		}
		return answer;
	}
}