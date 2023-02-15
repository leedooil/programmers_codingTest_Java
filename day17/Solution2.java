package day17;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public List solution(int n, int[] numlist) {
        List answer = new ArrayList();
        
        for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				answer.add(numlist[i]);
			}
		}        
        
        return answer;
    }
}