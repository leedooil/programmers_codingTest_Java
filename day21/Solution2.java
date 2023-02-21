package day21;

public class Solution2 {
	public int solution(int[][] board) {
        int answer = 0;

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (check(i, j, board)) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public boolean check(int x, int y, int[][] board) {
        // 대각선 위
        try {
            if (board[x-1][y-1] == 1) {
                return false;    
            }
        } catch (Exception e) {

        }

        // 위
        try {
            if (board[x-1][y] == 1) {
                return false; 
            }
        } catch (Exception e) {

        }

        // 대각선 위
        try {
            if (board[x-1][y+1] == 1) {
                return false;    
            }
        } catch (Exception e) {

        }

        // 좌
        try {
            if (board[x][y-1] == 1) {
                return false;    
            }
        } catch (Exception e) {

        }

        // 중심
        try {
            if (board[x][y] == 1) {
                return false;    
            }
        } catch (Exception e) {

        }

        // 우
        try {
            if (board[x][y+1] == 1) {
                return false;    
            }
        } catch (Exception e) {

        }

        // 대각선 아래
        try {
            if (board[x+1][y-1] == 1) {
                return false;    
            }
        } catch (Exception e) {

        }

        // 아래
        try {
            if (board[x+1][y] == 1) {
                return false;    
            }
        } catch (Exception e) {

        }

        // 대각선 아래
        try {
            if (board[x+1][y+1] == 1) {
                return false;    
            }
        } catch (Exception e) {

        }
        return true;
    }
}