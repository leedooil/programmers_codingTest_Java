package day12;

import java.util.*;
import java.util.stream.Collectors;

public class Solution4 {
	public List<Integer> solution(int n) {
		List<Integer> list = new ArrayList<Integer>();
		int initial = 2;
		
		while (n != 1) {
			if (n % initial == 0) {
				list.add(initial);
				n /= initial;
			}else {
				initial++;
			}
		}
		List<Integer> answer = list.stream().distinct().collect(Collectors.toList());
		return answer;
	}
}