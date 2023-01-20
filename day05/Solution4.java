package day05;

public class Solution4 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		int count = 0;
		for (int i = answer.length - 1; i >= 0; i--) {
			answer[count] = num_list[i];
			count++;
		}
		return answer;
	}
}