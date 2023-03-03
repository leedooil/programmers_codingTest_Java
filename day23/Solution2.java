package day23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution2 {
	public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        System.out.println(scoreList);
        scoreList.sort(Comparator.reverseOrder());
        System.out.println(scoreList);

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        System.out.println(answer[2]);
        System.out.println(answer[3]);
        return answer;
    }
	
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[][] score = {{80,70},{90,50},{40,70},{50,80}};
		sol.solution(score);
	}
}