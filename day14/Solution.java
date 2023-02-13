package day14;

import java.util.Arrays;

public class Solution {
	public int solution(int[] array, int n) {
		int answer = 0;
		int min = Integer.MAX_VALUE;
		
		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			int near = Abs(n - array[i]);
			
			if (min > near) {
				min = near;
				answer = array[i];
			}
			
		}

		return answer;

	}

	public static int Abs(int num) {

		return (num < 0) ? -num : num;

	}
}