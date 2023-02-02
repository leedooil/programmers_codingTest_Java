package day09;

public class Solution {
	public int solution(int hp) {
        int answer = 0;
        int bigAnt = 0;
        int middleAnt = 0;
        int smallAnt = 0;
        
        bigAnt = hp / 5;
        middleAnt = (hp % 5) / 3;
        smallAnt = (hp % 5) % 3;
        
        answer = bigAnt + middleAnt + smallAnt;
        return answer;
    }
}