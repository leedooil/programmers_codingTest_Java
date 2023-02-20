package day20;

public class Solution3 {
	public int solution(int[] numbers) {
        int answer = -2000000000;
        
        for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (answer < numbers[i] * numbers[j]) {
					answer = numbers[i] * numbers[j];
				}
			}
		}
        
        return answer;
    }
}