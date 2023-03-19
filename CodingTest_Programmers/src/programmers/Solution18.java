package programmers;

// 이상한 문자 만들기
public class Solution18 {
	public String solution(String s) {
    	String answer = "";
    	int cnt = 0;
    	
    	for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == ' ') {
        		cnt = 0;
        		answer += " ";
        	}else if(cnt % 2 == 0) {
        		answer += String.valueOf(s.charAt(i)).toUpperCase();
        		cnt++;
        	}else if(cnt % 2 == 1) {
        		answer += String.valueOf(s.charAt(i)).toLowerCase();
        		cnt++;       	        		
        	}
        }
    	
    	return answer;
    }
}
