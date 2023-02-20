package day20;

public class Solution2 {
	public int[] solution(String[] keyinput, int[] board) {
		 int[] answer = new int[2];

	        for(int i = 0; i < keyinput.length; i++) {
	            String key = keyinput[i];
	            if(key.equals("left")) {
	                if(Math.abs(answer[0] - 1) > board[0] / 2) {
	                    continue;
	                }
	                answer[0]--;
	            } else if(key.equals("right")) {
	                if(Math.abs(answer[0] + 1) > board[0] / 2) {
	                    continue;
	                }
	                answer[0]++;
	            } else if(key.equals("up")) {
	                if(Math.abs(answer[1] + 1) > board[1] / 2) {
	                    continue;
	                }
	                answer[1]++;
	            } else {
	                if(Math.abs(answer[1] - 1) > board[1] / 2) {
	                    continue;
	                }
	                answer[1]--;
	            }
	        }

	        return answer;
	    }
	}