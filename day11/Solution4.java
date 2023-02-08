package day11;

public class Solution4 {
	public int solution(int n) {
		int answer = 0;
		int pactorial = 1;
		int count = 0;

		for (int i = 1; i <= n; i++) {
			pactorial *= i;
			if (pactorial > n) {
				answer = count;
				break;
			} else if (pactorial == n) {
				count++;
				answer = count;
				break;
			} else if (pactorial < n) {
				count++;
			}
		}

		return answer;
	}
}