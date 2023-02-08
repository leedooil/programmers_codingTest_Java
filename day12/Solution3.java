package day12;

import java.util.Arrays;

public class Solution3 {
	public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        
        int[] numbers = Arrays.stream(my_string.split("")).mapToInt(Integer::parseInt).toArray();
        
        for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}
        
        return answer;
    }
}