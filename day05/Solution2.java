package day05;

public class Solution2 {
	public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = money / 5500;
        int balance = money - (5500 * coffee);
        answer[0] = coffee;
        answer[1] = balance;
        return answer;
    }
}