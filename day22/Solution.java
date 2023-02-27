package day22;

public class Solution {
	public int solution(int n) {
		int answer = n;

		for (int i = 1; i <= answer; i++) {
			if ((i % 3 == 0) || String.valueOf(i).contains("3")) {
				answer++;
			}
		}
		return answer;
	}
}