package day04;

public class Solution2 {
	public int solution(int n) {
        int answer = 0;
        
        int pizza = 1;
        while(true) {
            if((6 * pizza) % n != 0) {
            	pizza++;
            } else {
                answer = pizza;
                break;
            }
        }
        
        return answer;
    }
}