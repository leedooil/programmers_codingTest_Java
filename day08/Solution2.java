package day08;

public class Solution2 {
	public String solution(int age) {

		StringBuilder sb = new StringBuilder();

		while (age > 0) {
			sb.append((char) (97 + age % 10));
			age /= 10;
		}
		return String.valueOf(sb.reverse());
	}
}