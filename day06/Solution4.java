package day06;

public class Solution4 {
	public String solution(String my_string, int n) {
        String answer = "";
        int count = 0;
        char[] my_string_temp = new char[my_string.length()*n];
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < n; j++) {
				my_string_temp[count] = arr[i];
				count++;
			}
		}
        
        answer = String.valueOf(my_string_temp);
        
        return answer;
    }
}