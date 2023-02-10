package day13;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public int solution(String s) {
        int answer = 0;
        
        ArrayList<String> items = new ArrayList<>(Arrays.asList(s.split(" ")));
        
        while (items.contains("Z")) {
            items.remove(items.indexOf("Z") - 1);
            items.remove(items.indexOf("Z"));
        }
        
        for (int i = 0; i < items.size(); i++) {
			answer += Integer.parseInt(items.get(i));
		}
        
        return answer;
    }
}