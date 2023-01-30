package day07;

public class Solution3 {
	public int solution(int n, int k) {
        int answer = 0;
        int total = 0;
        
        total = (n * 12000) + (k * 2000) - ((n / 10) * 2000); 
        
        return total;
    }
}