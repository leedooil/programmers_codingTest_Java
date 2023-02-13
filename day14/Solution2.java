package day14;

import java.util.stream.Stream;

public class Solution2 {
	public int solution(int order) {
		int answer = 0;

		int[] intArr = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();

		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == 3) {
				answer++;
			} else if (intArr[i] == 6) {
				answer++;
			} else if (intArr[i] == 9) {
				answer++;
			}
		}

		return answer;
	}
}