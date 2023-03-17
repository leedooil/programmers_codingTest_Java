package day25;

public class Solution3 {
	public int[] solution(int num, int total) {
		int[] answer = new int[num];

		int sum = num * (num + 1) / 2;
		int start = (total - sum) / num;

		for (int i = 1; i < num + 1; i++) {
			answer[i - 1] = i + start;
		}

		return answer;

	}
}