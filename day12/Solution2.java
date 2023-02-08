package day12;

import java.util.Arrays;

public class Solution2 {
	public int[] solution(String my_string) {
		my_string = my_string.replaceAll("[a-z]", "");

		int[] numbers = Arrays.stream(my_string.split("")).mapToInt(Integer::parseInt).toArray();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		return numbers;
	}
}