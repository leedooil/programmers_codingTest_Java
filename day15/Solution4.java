package day15;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {
	public List<Integer> solution(int n) {
		List<Integer> intList = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				intList.add(i);
			}
		}
        
        return intList;
    }
}