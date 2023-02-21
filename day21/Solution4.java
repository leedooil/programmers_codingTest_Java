package day21;

public class Solution4 {
	public int solution(String[] spell, String[] dic) {
		boolean wordCheck = false;
		for (String word : dic) {
			int count = 0;
			for (String s : spell) {
				if (word.contains(s))
					count++;
			}
			if (count == spell.length) {
				wordCheck = true;
				break;
			}
		}
		return wordCheck ? 1 : 2;
	}
}