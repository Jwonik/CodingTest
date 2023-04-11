package programmers;

// 짝수와 홀수
public class Solution24 {
	public String solution(int num) {
        String answer = "";

        if(num % 2 == 0) {
        	answer = "Odd";
        }else {
        	answer = "Even";
        }
        
        return answer;
    }
}
