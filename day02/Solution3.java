package day02;

public class Solution3 {
	public int[] solution(int denum1, int num1, int denum2, int num2) {
		int[] answer;
		answer = new int[2];
		int bunja1 = (denum1 * num2) + (denum2 * num1);
		int bunmo1 = num1 * num2;

		int gcd = getGcd(bunja1, bunmo1);
		int bunja2 = (bunja1 / gcd);
		int bunmo2 = (bunmo1 / gcd);

		answer[0] = bunja2;
		answer[1] = bunmo2;

		return answer;
	}

	public static int getGcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return getGcd(b, a % b);
	}
}