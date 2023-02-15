package day17;

import java.util.stream.Stream;

public class Solution {
	public int solution(int num, int k) {
		int answer = 0;

		int[] digits = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
		
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] == k) {
				answer = i + 1;
				break;
			}
		}
		
		if (answer == 0) {
			answer = -1;
		}
		
		return answer;
	}
}