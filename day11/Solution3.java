package day11;

public class Solution3 {
	public int solution(int[] numbers) {
        int answer = 0;
        
        for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        return answer;
    }
	
}