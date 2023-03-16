package programmers;

// 문자열을 정수로 바꾸기
public class Solution15 {
	public int solution(String s) {
        int answer = 0;
        
        if(s.charAt(0) == '-') {
        	answer = -1 * Integer.parseInt(s.substring(1));        	
        }else {
        	answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}
