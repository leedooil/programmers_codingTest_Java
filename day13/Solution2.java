package day13;

public class Solution2 {
	public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
        
        return answer;
    }
}