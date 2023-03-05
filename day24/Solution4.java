package day24;

public class Solution4 {
	public int solution(int i, int j, int k) {
		int count = 0;
		for (int index = i; index <= j; index++) {
			for (char indexArr : String.valueOf(index).toCharArray()) {
				if (Integer.parseInt(String.valueOf(indexArr)) == k) {
					count++;
				}
			}
		}
		return count;
	}
}
