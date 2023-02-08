package day11;

public class Solution2 {
	public int solution(int n) {
		int answer = 0;
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (i < 2) {
				answer = 0;
			} else if (checkPrime(i) == 1) {
				answer = 0;
			} else {
				count++;
			}
			answer = count;
		}
		return answer;
	}

	static int checkPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return 0;
			}
		}
		return 1;
	}

}