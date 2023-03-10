package programmers;

// 문자열 다루기 기본
class Solution10 {
    public boolean solution(String s) {
        boolean answer = true;
      
       if(s.length() != 4 && s.length() != 6) {
        	answer = false;
        }
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) > 58) {
        		answer = false;
        	}
        }
        
        return answer;
    }
}
