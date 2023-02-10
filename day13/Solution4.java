package day13;

public class Solution4 {
	public int solution(int[] sides) {
		int answer = 0;

		for (int i = 0; i < sides.length; i++) {
			for (int j = i + 1; j < sides.length; j++) {
				if (sides[i] > sides[j]) {

					int temp = sides[i];
					sides[i] = sides[j];
					sides[j] = temp;

				}
			}
		}

		int sum = sides[0] + sides[1];

		if (sides[2] >= sum) {
			answer = 2;
		} else {
			answer = 1;
		}

		return answer;
	}
}