package programmers;

// 수박수박수박수박수박수?
public class Solution15 {
	public String solution(int n) {
        String answer = "";
        int count = n / 2;
        
        if(n % 2 == 0) {
        	answer = "수박".repeat(count);
        }else {
        	answer = "수박".repeat(count) + "수";
        }
        
        return answer;
    }
}
